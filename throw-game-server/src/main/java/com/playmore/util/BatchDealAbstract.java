package com.playmore.util;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class BatchDealAbstract<T> {

	private ExecutorService newFixedThreadPool;

	private List<T> datas;

	private int nThreads;

	public BatchDealAbstract(int nThreads, List<T> datas) {
		if (nThreads == 0)
			throw new RuntimeException("param error!");

		newFixedThreadPool = Executors.newFixedThreadPool(nThreads);
		this.datas = datas;
		this.nThreads = nThreads;
	}

	public void deal() {
		int dataSize = this.datas.size();
		int dealSize = dataSize / this.nThreads;

		int sIndex = 0;
		int eIndex = 0;

		try {
			if (dealSize <= 0) {
				// 直接执行
				List<T> subList = datas.subList(sIndex, dataSize);
				newFixedThreadPool.execute(new BatchTask(subList));
			} else {

				for (int i = 0; i < this.nThreads; i++) {
					sIndex = eIndex;
					eIndex += dealSize;
					
					List<T> subList = datas.subList(sIndex, eIndex);
					newFixedThreadPool.execute(new BatchTask(subList));
				}

				if (eIndex < dataSize) {
					List<T> subList = datas.subList(eIndex, dataSize);
					newFixedThreadPool.execute(new BatchTask(subList));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			newFixedThreadPool.shutdown();
		}
		
	}

	public abstract void execute(List<T> subList);

	private class BatchTask implements Runnable {
		private List<T> subList;

		public BatchTask(List<T> subList) {
			this.subList = subList;
		}

		public void run() {
			execute(subList);
		}
	}

}
