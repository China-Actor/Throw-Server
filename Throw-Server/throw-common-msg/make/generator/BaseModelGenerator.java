/*     */ package generator;
import com.playmore.database.generator.ColumnMeta;
import com.playmore.database.generator.JavaKeyword;
import com.playmore.database.generator.TableMeta;
/*     */ 
/*     */ import com.playmore.database.generator.kit.StrKit;
/*     */ import com.playmore.util.FileUtil;
/*     */ import com.playmore.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ 
/*     */ public class BaseModelGenerator
/*     */ {
/*  34 */   protected String packageTemplate = "package %s;%n%n";
/*     */ 
/*  36 */   protected String importTemplate = "import java.io.Serializable;%nimport com.playmore.database.DBFieldName;%n";
/*     */ 
/*  42 */   protected String classDefineTemplate = "%n/**%n * Do not touch! Close it Now!%n */%n@SuppressWarnings(\"serial\")%npublic class %s implements Serializable {%n%n";
/*     */ 
/*  49 */   protected String attributeTemplate = "\tprivate %s %s;%n";
/*     */ 
/*  52 */   protected String constructedFunctionTemplate = "%n\tpublic %s(){%n\t}%n%n";
/*     */ 
/*  56 */   protected String setterTemplate = "\tpublic void %s(%s %s) {%n\t\tthis.%s=%s;%n\t}%n%n";
/*     */ 
/*  60 */   protected String getterTemplate = "\tpublic %s %s() {%n\t\treturn %s;%n\t}%n%n";
/*     */ 
/*  64 */   protected String toStringTemplate = "\tpublic String toString() {%n\t\treturn \"%s [";
/*     */ 
/*  68 */   protected String toStringTemplateEnd = "+ \"]\";%n\t}%n";
/*     */   protected String baseModelPackageName;
/*     */   protected String baseModelOutputDir;
/*  73 */   protected JavaKeyword javaKeyword = new JavaKeyword();
/*     */ 
/*     */   public BaseModelGenerator(String baseModelPackageName, String baseModelOutputDir) {
/*  76 */     if (StrKit.isBlank(baseModelPackageName))
/*  77 */       throw new IllegalArgumentException("baseModelPackageName can not be blank.");
/*  78 */     if ((baseModelPackageName.contains("/")) || (baseModelPackageName.contains("\\")))
/*  79 */       throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
/*  80 */     if (StrKit.isBlank(baseModelOutputDir)) {
/*  81 */       throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
/*     */     }
/*  83 */     this.baseModelPackageName = baseModelPackageName;
/*  84 */     this.baseModelOutputDir = baseModelOutputDir;
/*     */   }
/*     */ 
/*     */   public void generate(List<TableMeta> tableMetas) {
/*  88 */     System.out.println("baseModelOutputDir=" + this.baseModelOutputDir);
/*  89 */     System.out.println("begin delete all " + this.baseModelOutputDir + " files");
/*  90 */     boolean isSuccess = FileUtil.deleteDirectory(this.baseModelOutputDir);
/*  91 */     System.out.println("begin delete " + (isSuccess ? "success" : "fail"));
/*  92 */     System.out.println("Generate base model ...");
/*  93 */     for (TableMeta tableMeta : tableMetas)
/*  94 */       genBaseModelContent(tableMeta);
/*  95 */     wirtToFile(tableMetas);
/*     */   }
/*     */ 
/*     */   protected void genBaseModelContent(TableMeta tableMeta) {
/*  99 */     StringBuilder ret = new StringBuilder();
/* 100 */     genPackage(ret);
/* 101 */     genImport(ret);
/* 102 */     genClassDefine(tableMeta, ret);
/*     */     String remarks;
/* 103 */     for (ColumnMeta columnMeta : tableMeta.columnMetas) {
/* 104 */       if ((columnMeta.remarks != null) && (!columnMeta.remarks.equals(""))) {
/* 105 */         remarks = columnMeta.remarks;
/* 106 */         String formatKey = StringUtil.subString(remarks, "{", "}");
/* 107 */         formatKey = formatKey == null ? "" : formatKey;
/* 108 */         if ((formatKey != null) && (!"".equals(formatKey))) remarks = remarks.replace("{" + formatKey + "}", "");
/*     */ 
/* 110 */         String externalKey = StringUtil.subString(remarks, "[", "]");
/* 111 */         externalKey = externalKey == null ? "" : externalKey;
/* 112 */         if ((externalKey != null) && (!"".equals(externalKey))) remarks = columnMeta.remarks.replace("[" + externalKey + "]", "");
/*     */ 
/* 114 */         ret.append(String.format("\t@DBFieldName(fieldName=\"" + remarks + 
/* 115 */           "\", ", new Object[0]));
/* 116 */         if ((externalKey != null) && (externalKey.length() > 0)) {
/* 117 */           ret.append(String.format("externalKey=\"" + externalKey + "\", ", new Object[0]));
/*     */         }
/* 119 */         if ((formatKey != null) && (formatKey.length() > 0)) {
/* 120 */           ret.append(String.format("formatKey=\"" + formatKey + "\", ", new Object[0]));
/*     */         }
/* 122 */         ret.append(String.format("isNullable=\"" + columnMeta.isNullable.toString() + "\")%n", new Object[0]));
/*     */       }
/*     */ 
/* 125 */       if ((columnMeta.type != null) && (columnMeta.type.toLowerCase().endsWith("date")))
/* 126 */         ret.append(String.format("\t@DateTimeFormat(pattern = \"yyyy-MM-dd\")%n", new Object[0]));
/* 127 */       else if ((columnMeta.type != null) && ((columnMeta.type.toLowerCase().endsWith("datetime")) || (columnMeta.type.toLowerCase().endsWith("timestamp")))) {
/* 128 */         ret.append(String.format("\t@DateTimeFormat(pattern = \"yyyy-MM-dd HH:mm:ss\")%n", new Object[0]));
/*     */       }
/* 130 */       genAttribute(columnMeta, ret);
/*     */     }
/* 132 */     genConstructedFunction(tableMeta, ret);
/* 133 */     for (ColumnMeta columnMeta : tableMeta.columnMetas) {
/* 134 */       genSetMethodName(columnMeta, ret);
/* 135 */       genGetMethodName(columnMeta, ret);
/*     */     }
/* 137 */     genToStringMethodName(tableMeta, ret);
/* 138 */     int i = 0;
/* 139 */     for (ColumnMeta columnMeta : tableMeta.columnMetas) {
/* 140 */       ret.append(String.format(columnMeta.attrName + "=\" + " + columnMeta.attrName, new Object[0]));
/* 141 */       if (i != tableMeta.columnMetas.size() - 1) ret.append(" + \" ,");
/* 142 */       i++;
/*     */     }
/* 144 */     genToStringMethodNameEnd(tableMeta, ret);
/* 145 */     ret.append(String.format("}%n", new Object[0]));
/* 146 */     tableMeta.baseModelContent = ret.toString();
/*     */   }
/*     */ 
/*     */   protected void genPackage(StringBuilder ret) {
/* 150 */     ret.append(String.format(this.packageTemplate, new Object[] { this.baseModelPackageName }));
/*     */   }
/*     */ 
/*     */   protected void genImport(StringBuilder ret) {
/* 154 */     ret.append(String.format(this.importTemplate, new Object[0]));
/*     */   }
/*     */ 
/*     */   protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) {
/* 158 */     ret.append(String.format(this.classDefineTemplate, new Object[] { tableMeta.baseModelName }));
/*     */   }
/*     */ 
/*     */   protected void genAttribute(ColumnMeta columnMeta, StringBuilder ret) {
/* 162 */     String javaType = StrKit.getBaseAttribute(columnMeta.javaType);
/* 163 */     String attribute = String.format(this.attributeTemplate, new Object[] { javaType, columnMeta.attrName });
/* 164 */     ret.append(attribute);
/*     */   }
/*     */ 
/*     */   protected void genConstructedFunction(TableMeta tableMeta, StringBuilder ret) {
/* 168 */     String constructedFunction = String.format(this.constructedFunctionTemplate, new Object[] { tableMeta.baseModelName });
/* 169 */     ret.append(constructedFunction);
/*     */   }
/*     */ 
/*     */   protected void genSetMethodName(ColumnMeta columnMeta, StringBuilder ret)
/*     */   {
/* 174 */     String setterMethodName = "set" + StrKit.firstCharToUpperCase(columnMeta.attrName);
/*     */ 
/* 176 */     String argName = this.javaKeyword.contains(columnMeta.attrName) ? "_" + columnMeta.attrName : columnMeta.attrName;
/* 177 */     String javaType = StrKit.getBaseAttribute(columnMeta.javaType);
/* 178 */     String setter = String.format(this.setterTemplate, new Object[] { setterMethodName, javaType, argName, columnMeta.attrName, argName });
/* 179 */     ret.append(setter);
/*     */   }
/*     */ 
/*     */   protected void genGetMethodName(ColumnMeta columnMeta, StringBuilder ret) {
/* 183 */     String getterMethodName = "get" + StrKit.firstCharToUpperCase(columnMeta.attrName);
/* 184 */     String javaType = StrKit.getBaseAttribute(columnMeta.javaType);
/* 185 */     String getter = String.format(this.getterTemplate, new Object[] { javaType, getterMethodName, columnMeta.attrName });
/* 186 */     ret.append(getter);
/*     */   }
/*     */ 
/*     */   protected void genToStringMethodName(TableMeta tableMeta, StringBuilder ret) {
/* 190 */     ret.append(String.format(this.toStringTemplate, new Object[] { tableMeta.baseModelName }));
/*     */   }
/*     */   protected void genToStringMethodNameEnd(TableMeta tableMeta, StringBuilder ret) {
/* 193 */     ret.append(String.format(this.toStringTemplateEnd, new Object[0]));
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(List<TableMeta> tableMetas) {
/*     */     try {
/* 198 */       for (TableMeta tableMeta : tableMetas)
/* 199 */         wirtToFile(tableMeta);
/*     */     } catch (IOException e) {
/* 201 */       throw new RuntimeException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void wirtToFile(TableMeta tableMeta)
/*     */     throws IOException
/*     */   {
/* 209 */     File dir = new File(this.baseModelOutputDir);
/* 210 */     if (!dir.exists()) {
/* 211 */       dir.mkdirs();
/*     */     }
/* 213 */     String target = this.baseModelOutputDir + File.separator + tableMeta.baseModelName + ".java";
/* 214 */     FileWriter fw = new FileWriter(target);
/*     */     try {
/* 216 */       System.out.println("writeToFile:" + target);
/* 217 */       fw.write(tableMeta.baseModelContent);
/*     */     }
/*     */     finally {
/* 220 */       fw.close();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\15849\Desktop\JD-GUI\DBQueue-0.0.1-SNAPSHOT.jar
 * Qualified Name:     com.playmore.database.generator.BaseModelGenerator
 * JD-Core Version:    0.6.2
 */