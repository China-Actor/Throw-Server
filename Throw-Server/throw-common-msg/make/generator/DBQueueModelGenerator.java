/*     */ package generator;
import com.playmore.database.generator.JavaKeyword;
import com.playmore.database.generator.TableMeta;
/*     */ 
/*     */ import com.playmore.database.generator.kit.StrKit;
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ 
/*     */ public class DBQueueModelGenerator
/*     */ {
/*  34 */   protected String packageTemplate = "package %s;%n%n";
/*     */ 
/*  36 */   protected String importTemplate = "import com.playmore.database.dao.DBQueueDao;%nimport com.playmore.database.dbqueue.DBQueueManager;%nimport com.playmore.database.dbqueue.DefaultDBQueue;%nimport %s.%s;%nimport %s.dao.%sDaoImpl;%nimport org.springframework.stereotype.Component;%nimport org.springframework.beans.factory.annotation.Autowired;%n";
/*     */ 
/*  42 */   protected String classDefineTemplate = "/**%n * Do not touch! Close it Now!%n **/%n@Component%npublic class %sDBQueue extends DefaultDBQueue<%s> {%n%n\t@Autowired%n\t%sDaoImpl daoImpl;%n%n";
/*     */ 
/*  49 */   protected String factoryTemplate = "\tprivate static final %sDBQueue DEFAULT = new\t%sDBQueue();%n\tpublic static %sDBQueue getDefault() {%n\t\treturn DEFAULT;%n\t}%n";
/*     */ 
/*  55 */   protected String constructedFunction = "\tprivate %sDBQueue(){%n\t\tDBQueueManager.getDefault().addDbQueue(this);%n\t}%n";
/*     */ 
/*  60 */   protected String getDaoTemplate = "\tpublic DBQueueDao<%s> getDao() {%n\t\treturn this.daoImpl;%n\t}%n";
/*     */   protected String baseModelPackageName;
/*     */   protected String baseModelOutputDir;
/*  66 */   protected JavaKeyword javaKeyword = new JavaKeyword();
/*     */ 
/*     */   public DBQueueModelGenerator(String baseModelPackageName, String baseModelOutputDir) {
/*  69 */     if (StrKit.isBlank(baseModelPackageName))
/*  70 */       throw new IllegalArgumentException("baseModelPackageName can not be blank.");
/*  71 */     if ((baseModelPackageName.contains("/")) || (baseModelPackageName.contains("\\")))
/*  72 */       throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
/*  73 */     if (StrKit.isBlank(baseModelOutputDir)) {
/*  74 */       throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
/*     */     }
/*  76 */     this.baseModelPackageName = baseModelPackageName;
/*  77 */     this.baseModelOutputDir = baseModelOutputDir;
/*     */   }
/*     */ 
/*     */   public void generate(List<TableMeta> tableMetas) {
/*  81 */     System.out.println("Generate base model ...");
/*  82 */     for (TableMeta tableMeta : tableMetas)
/*  83 */       genBaseModelContent(tableMeta);
/*  84 */     wirtToFile(tableMetas);
/*     */   }
/*     */ 
/*     */   protected void genBaseModelContent(TableMeta tableMeta) {
/*  88 */     StringBuilder ret = new StringBuilder();
/*  89 */     genPackage(ret);
/*  90 */     genImport(tableMeta, ret);
/*  91 */     genClassDefine(tableMeta, ret);
/*  92 */     genFacotryMethod(tableMeta, ret);
/*  93 */     genConstructedFunction(tableMeta, ret);
/*  94 */     gengetDaoMethod(tableMeta, ret);
/*  95 */     ret.append(String.format("}%n", new Object[0]));
/*  96 */     tableMeta.baseModelContent = ret.toString();
/*     */   }
/*     */ 
/*     */   protected void genPackage(StringBuilder ret) {
/* 100 */     ret.append(String.format(this.packageTemplate, new Object[] { this.baseModelPackageName }));
/*     */   }
/*     */ 
/*     */   protected void genImport(TableMeta tableMeta, StringBuilder ret) {
/* 104 */     ret.append(String.format(this.importTemplate, new Object[] { StrKit.splitPackageName(this.baseModelPackageName), tableMeta.baseModelName, StrKit.splitPackageName(this.baseModelPackageName), tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) {
/* 108 */     ret.append(String.format(this.classDefineTemplate, new Object[] {tableMeta.baseModelName,  tableMeta.baseModelName, tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genFacotryMethod(TableMeta tableMeta, StringBuilder ret) {
/* 112 */     //ret.append(String.format(this.factoryTemplate, new Object[] { tableMeta.baseModelName, tableMeta.baseModelName, tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genConstructedFunction(TableMeta tableMeta, StringBuilder ret) {
/* 116 */     ret.append(String.format(this.constructedFunction, new Object[] { tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void gengetDaoMethod(TableMeta tableMeta, StringBuilder ret) {
/* 120 */     ret.append(String.format(this.getDaoTemplate, new Object[] {  tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(List<TableMeta> tableMetas) {
/*     */     try {
/* 125 */       for (TableMeta tableMeta : tableMetas)
/* 126 */         wirtToFile(tableMeta);
/*     */     } catch (IOException e) {
/* 128 */       throw new RuntimeException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(TableMeta tableMeta)
/*     */     throws IOException
/*     */   {
/* 136 */     File dir = new File(this.baseModelOutputDir);
/* 137 */     if (!dir.exists()) {
/* 138 */       dir.mkdirs();
/*     */     }
/* 140 */     String target = this.baseModelOutputDir + File.separator + tableMeta.baseModelName + "DBQueue" + ".java";
/* 141 */     FileWriter fw = new FileWriter(target);
/*     */     try {
/* 143 */       fw.write(tableMeta.baseModelContent);
/*     */     }
/*     */     finally {
/* 146 */       fw.close();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\15849\Desktop\JD-GUI\DBQueue-0.0.1-SNAPSHOT.jar
 * Qualified Name:     com.playmore.database.generator.DBQueueModelGenerator
 * JD-Core Version:    0.6.2
 */