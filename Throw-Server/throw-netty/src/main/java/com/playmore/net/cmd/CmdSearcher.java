/*    */ package com.playmore.net.cmd;
/*    */ 
/*    */ import com.playmore.util.ClassUtil;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class CmdSearcher
/*    */ {
/* 13 */   private Map<Number, Method> methedMap = new HashMap();
/*    */   
/* 15 */   private Map<Number, Object> objectMap = new HashMap();
/*    */   
/* 17 */   private Map<Number, Method> msgThransMap = new HashMap();
/*    */ 
/*    */ 
/*    */   
/* 21 */   public Map<Number, Object> getObjectMap() { return this.objectMap; }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public Map<Number, Method> getMethedMap() { return this.methedMap; }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public Map<Number, Method> getMsgClassMap() { return this.msgThransMap; }
/*    */ 
/*    */   
/*    */   public CmdSearcher(String path) {
/* 33 */     List<Class<?>> classList = ClassUtil.getClasses(path);
/* 34 */     for (Class cls : classList) {
/*    */       try {
/* 36 */         findCmdMethod(cls);
/* 37 */       } catch (InstantiationException e) {
/* 38 */         e.printStackTrace();
/* 39 */       } catch (IllegalAccessException e) {
/* 40 */         e.printStackTrace();
/* 41 */       } catch (NoSuchMethodException e) {
/* 42 */         e.printStackTrace();
/* 43 */       } catch (SecurityException e) {
/* 44 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void findCmdMethod(Class cls) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
/* 54 */Method[] methods = cls.getDeclaredMethods();
	    Method[] arrayOfMethod1;
	    int j = (arrayOfMethod1 = methods).length;
	    for (int b = 0; b < j; b++)
	    {
	      Method method = arrayOfMethod1[b];
	      Annotation[][] annot = method.getParameterAnnotations();
	      for (int i = 0; i < annot.length; i++)
	      {
	        Annotation[] arrayOfAnnotation;
	        int m = (arrayOfAnnotation = annot[i]).length;
	        for (int k = 0; k < m; k++)
	        {
	          Annotation a = arrayOfAnnotation[k];
	          if (CMD.class.isAssignableFrom(a.getClass()))
	          {
	            CMD cmd = (CMD)a;
	            this.methedMap.put(Short.valueOf(cmd.cmd()), method);
	            Object o = cls.newInstance();
	            this.objectMap.put(Short.valueOf(cmd.cmd()), o);
	            Class msgClass = method.getParameterTypes()[i];
	            Method parseFrom = null;
	            if (cmd.cmd() != 0) {
	              parseFrom = msgClass.getMethod(cmd.parseMethod(), new Class[] { byte[].class });
	            }
	            this.msgThransMap.put(Short.valueOf(cmd.cmd()), parseFrom);
	            break;
          }
        }
      }
    }
/*    */   
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\cmd\CmdSearcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */