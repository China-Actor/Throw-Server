package com.playmore.net.cmd;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;

import com.bottle.c2s.test.S2CReward.RewardItem;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.playmore.net.session.ISession;
import com.playmore.net.session.ISessionConfig;
import com.playmore.net.session.ISessionHolder;
import com.playmore.net.session.MessageCounter;
import com.playmore.util.ClassUtil;

public class CmdSearcher {
	private Map<Number, Method> methedMap = new HashMap<>();

	private Map<Number, Object> objectMap = new HashMap<>();

	private Map<Number, Method> msgThransMap = new HashMap<>();

	public Map<Number, Object> getObjectMap() {
		return this.objectMap;
	}

	public Map<Number, Method> getMethedMap() {
		return this.methedMap;
	}

	public Map<Number, Method> getMsgClassMap() {
		return this.msgThransMap;
	}

	public CmdSearcher(String path) {
		List<Class<?>> classList = getClasspath(path);//ClassUtil.getClasses(path);
		for (Class cls : classList) {
			try {
				findCmdMethod(cls);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<Class<?>> getClasspath(String packagePath)  {
        List<Class<?>> list=null;
		try {
			ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
			MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resourcePatternResolver);
			// 加载系统所有类资源
			Resource[] resources = resourcePatternResolver.getResources("classpath*:" + packagePath.replaceAll("[.]", "/") + "/**/*.class");
			list = new ArrayList<Class<?>>();
			// 把每一个class文件找出来
			for (Resource r : resources) {
			    MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(r);
			    Class<?> clazz = ClassUtils.forName(metadataReader.getClassMetadata().getClassName(), null);
			    list.add(clazz);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LinkageError e) {
			e.printStackTrace();
		}
        return list;
    }
 

	private void findCmdMethod(Class cls) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		Method[] methods = cls.getDeclaredMethods();
		Method[] arrayOfMethod1;
		int j = (arrayOfMethod1 = methods).length;
		for (int b = 0; b < j; b++) {
			Method method = arrayOfMethod1[b];
			Annotation[][] annot = method.getParameterAnnotations();
			for (int i = 0; i < annot.length; i++) {
				Annotation[] arrayOfAnnotation;
				int m = (arrayOfAnnotation = annot[i]).length;
				for (int k = 0; k < m; k++) {
					Annotation a = arrayOfAnnotation[k];

//	          if (CMD.class.isAssignableFrom(a.getClass()))
					if ("CMD".equals(a.annotationType().getSimpleName())) {
						// CMD cmd = (CMD)a;
						Map<String, Object> annotationAttributes = AnnotationUtils.getAnnotationAttributes(a);
						short cmd = (Short) annotationAttributes.get("cmd");
						String parseFromMethod = (String) annotationAttributes.get("parseMethod");
						this.methedMap.put(Short.valueOf(cmd), method);
						Object o = cls.newInstance();
						this.objectMap.put(Short.valueOf(cmd), o);
						Class msgClass = method.getParameterTypes()[i];
						Method parseFrom = null;
						if (cmd != 0) {
							parseFrom = msgClass.getMethod(parseFromMethod, new Class[] { byte[].class });
						}
						this.msgThransMap.put(Short.valueOf(cmd), parseFrom);
						break;
					}
				}
			}
		}

	}
}
