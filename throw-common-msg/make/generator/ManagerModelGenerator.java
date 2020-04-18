/*     */ package generator;
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.util.List;

import com.playmore.database.generator.JavaKeyword;
import com.playmore.database.generator.TableMeta;
/*     */ 
/*     */ import com.playmore.database.generator.kit.StrKit;
/*     */ 
/*     */ public class ManagerModelGenerator
/*     */ {
/*  32 */   protected String packageTemplate = "package %s;%n%n";
/*     */ 
/*  34 */   protected String importTemplate = "import %s.%s;%nimport %s.dao.%sDaoImpl;%nimport com.playmore.manager.AbstractManager;%nimport org.springframework.stereotype.Component;%nimport org.springframework.beans.factory.annotation.Autowired;%nimport java.util.Collection;%nimport com.playmore.annotation.DataSource;%nimport com.playmore.opsconfig.DataSourceNames;%n";
/*     */ 
/*  46 */   protected String classDefineTemplate = "/**%n * Do not touch! Close it Now! %n */%n@Component%npublic class %sManager extends AbstractManager<%s,%s> {%n%n\t@Autowired%n\t%sDaoImpl daoImpl;%n%n";
/*     */ 
/*  53 */   protected String factoryTemplate = "\tprivate %sManager(){%n\t}%n\tprivate static final %sManager DEFAULT = new\t%sManager();%n\tpublic static %sManager getDefault() {%n\t\treturn DEFAULT;%n\t}%n";
/*     */ 
			protected String initTemplate ="%n\t@Override %n\tpublic void load() {%n\t}%n%n\t@DataSource(DataSourceNames.STATIC)%n\tpublic void init() {%n\t\tsuper.load();%n\t}%n";
/*  61 */   protected String queryAllFromDbTemplate = "\t@Override%n\tpublic Collection<%s> queryAllFromDb() {%n\t\treturn this.daoImpl.queryAll();%n\t}%n";
/*     */ 
/*  67 */   protected String getKeyTemplate = "\t@Override%n\tpublic %s getKey(%s t) {%n\t\treturn t.getId();%n\t}%n";
/*     */   protected String baseModelPackageName;
/*     */   protected String baseModelOutputDir;
/*  76 */   protected JavaKeyword javaKeyword = new JavaKeyword();
/*     */ 
/*     */   public ManagerModelGenerator(String baseModelPackageName, String baseModelOutputDir) {
/*  79 */     if (StrKit.isBlank(baseModelPackageName))
/*  80 */       throw new IllegalArgumentException("baseModelPackageName can not be blank.");
/*  81 */     if ((baseModelPackageName.contains("/")) || (baseModelPackageName.contains("\\")))
/*  82 */       throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
/*  83 */     if (StrKit.isBlank(baseModelOutputDir)) {
/*  84 */       throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
/*     */     }
/*  86 */     this.baseModelPackageName = baseModelPackageName;
/*  87 */     this.baseModelOutputDir = baseModelOutputDir;
/*     */   }
/*     */ 
/*     */   public void generate(List<TableMeta> tableMetas) throws Exception {
/*  91 */     System.out.println("Generate dao model ...");
/*  92 */     for (TableMeta tableMeta : tableMetas) {
/*     */       try {
/*  94 */         genBaseModelContent(tableMeta);
/*     */       } catch (Exception e) {
/*  96 */         e.printStackTrace();
/*  97 */         System.out.println("Generate dao model exception!!" + tableMeta.baseModelName);
/*     */       }
/*     */     }
/* 100 */     wirtToFile(tableMetas);
/*     */   }
/*     */ 
/*     */   protected void genBaseModelContent(TableMeta tableMeta) throws Exception {
/* 104 */     StringBuilder ret = new StringBuilder();
/* 105 */     genPackage(ret);
/* 106 */     genImport(tableMeta, ret);
/* 107 */     genClassDefine(tableMeta, ret);
/* 108 */     genFacotryMethod(tableMeta, ret);
		genInitMethod(tableMeta,ret);
/* 109 */     genQueryAllFromDbMethod(tableMeta, ret);
/* 110 */     genGetKeyMethod(tableMeta, ret);
/* 111 */     ret.append(String.format("}%n", new Object[0]));
/* 112 */     tableMeta.baseModelContent = ret.toString();
/*     */   }

			private void genInitMethod(TableMeta tableMeta, StringBuilder ret) {
				ret.append(String.format(this.initTemplate));
			}
/*     */ 
/*     */   protected void genPackage(StringBuilder ret) {
/* 116 */     ret.append(String.format(this.packageTemplate, new Object[] { this.baseModelPackageName }));
/*     */   }
/*     */ 
/*     */   protected void genImport(TableMeta tableMeta, StringBuilder ret) {
/* 120 */     ret.append(String.format(this.importTemplate, new Object[] { StrKit.splitPackageName(this.baseModelPackageName), tableMeta.baseModelName, 
/* 121 */       StrKit.splitPackageName(this.baseModelPackageName), tableMeta.baseModelName, 
/* 122 */       StrKit.splitPackageName(this.baseModelPackageName), tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) throws Exception
/*     */   {
/* 127 */     ret.append(String.format(this.classDefineTemplate, new Object[] { tableMeta.baseModelName, 
/* 128 */       tableMeta.getPrimaryColumnMeta().javaType, tableMeta.baseModelName, tableMeta.baseModelName  }));
/*     */   }
/*     */ 
	/*     */ protected void genFacotryMethod(TableMeta tableMeta, StringBuilder ret) {
///* 132 */     ret.append(String.format(this.factoryTemplate, new Object[] { tableMeta.baseModelName, tableMeta.baseModelName, tableMeta.baseModelName, tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genQueryAllFromDbMethod(TableMeta tableMeta, StringBuilder ret) {
/* 136 */     ret.append(String.format(this.queryAllFromDbTemplate, new Object[] { tableMeta.baseModelName, tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genGetKeyMethod(TableMeta tableMeta, StringBuilder ret) throws Exception {
/* 140 */     ret.append(String.format(this.getKeyTemplate, new Object[] { tableMeta.getPrimaryColumnMeta().javaType, tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(List<TableMeta> tableMetas) {
/*     */     try {
/* 145 */       for (TableMeta tableMeta : tableMetas)
/* 146 */         wirtToFile(tableMeta);
/*     */     } catch (IOException e) {
/* 148 */       throw new RuntimeException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(TableMeta tableMeta)
/*     */     throws IOException
/*     */   {
/* 156 */     File dir = new File(this.baseModelOutputDir);
/* 157 */     if (!dir.exists()) {
/* 158 */       dir.mkdirs();
/*     */     }
/* 160 */     String target = this.baseModelOutputDir + File.separator + tableMeta.baseModelName + "Manager" + ".java";
/* 161 */     FileWriter fw = new FileWriter(target);
/*     */     try {
/* 163 */       fw.write(tableMeta.baseModelContent);
/*     */     }
/*     */     finally {
/* 166 */       fw.close();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\15849\Desktop\JD-GUI\DBQueue-0.0.1-SNAPSHOT.jar
 * Qualified Name:     com.playmore.database.generator.ManagerModelGenerator
 * JD-Core Version:    0.6.2
 */