/*     */ package protobuf;
/*     */ 
/*     */ import com.google.protobuf.AbstractParser;
/*     */ import com.google.protobuf.ByteString;
/*     */ import com.google.protobuf.CodedInputStream;
/*     */ import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
/*     */ import com.google.protobuf.Descriptors.Descriptor;
/*     */ import com.google.protobuf.Descriptors.FileDescriptor;
/*     */ import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
/*     */ import com.google.protobuf.ExtensionRegistry;
/*     */ import com.google.protobuf.ExtensionRegistryLite;
/*     */ import com.google.protobuf.GeneratedMessage;
/*     */ import com.google.protobuf.GeneratedMessage.Builder;
/*     */ import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
/*     */ import com.google.protobuf.InvalidProtocolBufferException;
/*     */ import com.google.protobuf.Message;
/*     */ import com.google.protobuf.Parser;
/*     */ import com.google.protobuf.UnknownFieldSet;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.ObjectStreamException;
/*     */ 
/*     */ public final class S2CLoginMsg
/*     */ {
/*     */   private static Descriptors.Descriptor internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor;
/*     */   private static GeneratedMessage.FieldAccessorTable internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_fieldAccessorTable;
/*     */   private static Descriptors.FileDescriptor descriptor;
/*     */   
/*     */   public static final class Login extends GeneratedMessage implements S2CLoginMsg.LoginOrBuilder
/*     */   {
/*     */     private static final Login defaultInstance;
/*     */     private final UnknownFieldSet unknownFields;
/*     */     
/*     */     private Login(GeneratedMessage.Builder<?> builder)
/*     */     {
/*  37 */       super();
/*  38 */       this.unknownFields = builder.getUnknownFields(); }
/*     */     
/*  40 */     private Login(boolean noInit) { this.unknownFields = UnknownFieldSet.getDefaultInstance(); }
/*     */     
/*     */     public static Login getDefaultInstance()
/*     */     {
/*  44 */       return defaultInstance;
/*     */     }
/*     */     
/*     */     public Login getDefaultInstanceForType() {
/*  48 */       return defaultInstance;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     public final UnknownFieldSet getUnknownFields()
/*     */     {
/*  55 */       return this.unknownFields;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public static final Descriptors.Descriptor getDescriptor()
/*     */     {
/*  99 */       return S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor;
/*     */     }
/*     */     
/*     */     protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable()
/*     */     {
/* 104 */       return 
/* 105 */         S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_fieldAccessorTable.ensureFieldAccessorsInitialized(
/* 106 */         Login.class, Builder.class);
/*     */     }
/*     */     
/*     */ 
/* 110 */     public static Parser<Login> PARSER = new AbstractParser()
/*     */     {
/*     */ 
/*     */       public S2CLoginMsg.Login parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry)
/*     */         throws InvalidProtocolBufferException {
/* 115 */         return null; }
/*     */     };
/*     */     private int bitField0_;
/*     */     public static final int ISSUCCESS_FIELD_NUMBER = 1;
/*     */     private boolean isSuccess_;
/*     */     
/* 121 */     public Parser<Login> getParserForType() { return PARSER; }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public boolean hasIsSuccess()
/*     */     {
/* 132 */       return (this.bitField0_ & 0x1) == 1;
/*     */     }
/*     */     
/*     */ 
/*     */     public boolean getIsSuccess()
/*     */     {
/* 138 */       return this.isSuccess_;
/*     */     }
/*     */     
/*     */ 
/* 142 */     private void initFields() { this.isSuccess_ = false; }
/*     */     
/* 144 */     private byte memoizedIsInitialized = -1;
/*     */     
/* 146 */     public final boolean isInitialized() { byte isInitialized = this.memoizedIsInitialized;
/* 147 */       if (isInitialized != -1) { return isInitialized == 1;
/*     */       }
/* 149 */       if (!hasIsSuccess()) {
/* 150 */         this.memoizedIsInitialized = 0;
/* 151 */         return false;
/*     */       }
/* 153 */       this.memoizedIsInitialized = 1;
/* 154 */       return true;
/*     */     }
/*     */     
/*     */     public void writeTo(CodedOutputStream output) throws IOException
/*     */     {
/* 159 */       getSerializedSize();
/* 160 */       if ((this.bitField0_ & 0x1) == 1) {
/* 161 */         output.writeBool(1, this.isSuccess_);
/*     */       }
/* 163 */       getUnknownFields().writeTo(output);
/*     */     }
/*     */     
/* 166 */     private int memoizedSerializedSize = -1;
/*     */     
/* 168 */     public int getSerializedSize() { int size = this.memoizedSerializedSize;
/* 169 */       if (size != -1) { return size;
/*     */       }
/* 171 */       size = 0;
/* 172 */       if ((this.bitField0_ & 0x1) == 1)
/*     */       {
/* 174 */         size = size + CodedOutputStream.computeBoolSize(1, this.isSuccess_);
/*     */       }
/* 176 */       size += getUnknownFields().getSerializedSize();
/* 177 */       this.memoizedSerializedSize = size;
/* 178 */       return size;
/*     */     }
/*     */     
/*     */ 
/*     */     protected Object writeReplace()
/*     */       throws ObjectStreamException
/*     */     {
/* 185 */       return super.writeReplace();
/*     */     }
/*     */     
/*     */     public static Login parseFrom(ByteString data)
/*     */       throws InvalidProtocolBufferException
/*     */     {
/* 191 */       return (Login)PARSER.parseFrom(data);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry)
/*     */       throws InvalidProtocolBufferException
/*     */     {
/* 197 */       return (Login)PARSER.parseFrom(data, extensionRegistry);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(byte[] data) throws InvalidProtocolBufferException {
/* 201 */       return (Login)PARSER.parseFrom(data);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry)
/*     */       throws InvalidProtocolBufferException
/*     */     {
/* 207 */       return (Login)PARSER.parseFrom(data, extensionRegistry);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(InputStream input) throws IOException {
/* 211 */       return (Login)PARSER.parseFrom(input);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry)
/*     */       throws IOException
/*     */     {
/* 217 */       return (Login)PARSER.parseFrom(input, extensionRegistry);
/*     */     }
/*     */     
/*     */     public static Login parseDelimitedFrom(InputStream input) throws IOException {
/* 221 */       return (Login)PARSER.parseDelimitedFrom(input);
/*     */     }
/*     */     
/*     */     public static Login parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry)
/*     */       throws IOException
/*     */     {
/* 227 */       return (Login)PARSER.parseDelimitedFrom(input, extensionRegistry);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(CodedInputStream input) throws IOException
/*     */     {
/* 232 */       return (Login)PARSER.parseFrom(input);
/*     */     }
/*     */     
/*     */     public static Login parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry)
/*     */       throws IOException
/*     */     {
/* 238 */       return (Login)PARSER.parseFrom(input, extensionRegistry);
/*     */     }
/*     */     
/* 241 */     public static Builder newBuilder() { return null; }
/* 242 */     public Builder newBuilderForType() { return newBuilder(); }
/*     */     
/* 244 */     public static Builder newBuilder(Login prototype) { return newBuilder().mergeFrom(prototype); }
/*     */     
/* 246 */     public Builder toBuilder() { return newBuilder(this); }
/*     */     
/*     */ 
/*     */     protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent)
/*     */     {
/* 251 */       Builder builder =null;
/* 252 */       return builder;
/*     */     }
/*     */     
/*     */ 
/*     */     private static final long serialVersionUID = 0L;
/*     */     
/*     */     public static final class Builder
/*     */       extends GeneratedMessage.Builder<Builder>
/*     */       implements S2CLoginMsg.LoginOrBuilder
/*     */     {
/*     */       private int bitField0_;
/*     */       private boolean isSuccess_;
/*     */       
/*     */       public static final Descriptors.Descriptor getDescriptor()
/*     */       {
/* 267 */         return S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor;
/*     */       }
/*     */       
/*     */       protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable()
/*     */       {
/* 272 */         return 
/* 273 */           S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_fieldAccessorTable.ensureFieldAccessorsInitialized(
/* 274 */           S2CLoginMsg.Login.class, Builder.class);
/*     */       }
/*     */       
/*     */       private Builder()
/*     */       {
/* 279 */         maybeForceBuilderInitialization();
/*     */       }
/*     */       
/*     */       private Builder(GeneratedMessage.BuilderParent parent)
/*     */       {
/* 284 */         super();
/* 285 */         maybeForceBuilderInitialization();
/*     */       }
/*     */       
/*     */       private void maybeForceBuilderInitialization() {}
/*     */       
/*     */       private static Builder create()
/*     */       {
/* 292 */         return new Builder();
/*     */       }
/*     */       
/*     */       public Builder clear() {
/* 296 */         super.clear();
/* 297 */         this.isSuccess_ = false;
/* 298 */         this.bitField0_ &= 0xFFFFFFFE;
/* 299 */         return this;
/*     */       }
/*     */       
/*     */       public Builder clone() {
/* 303 */         return create().mergeFrom(buildPartial());
/*     */       }
/*     */       
/*     */       public Descriptors.Descriptor getDescriptorForType()
/*     */       {
/* 308 */         return S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor;
/*     */       }
/*     */       
/*     */       public S2CLoginMsg.Login getDefaultInstanceForType() {
/* 312 */         return S2CLoginMsg.Login.getDefaultInstance();
/*     */       }
/*     */       
/*     */       public S2CLoginMsg.Login build() {
/* 316 */         S2CLoginMsg.Login result = buildPartial();
/* 317 */         if (!result.isInitialized()) {
/* 318 */           throw newUninitializedMessageException(result);
/*     */         }
/* 320 */         return result;
/*     */       }
/*     */       
/*     */       public S2CLoginMsg.Login buildPartial() {
/* 324 */         S2CLoginMsg.Login result = null;
/* 325 */         int from_bitField0_ = this.bitField0_;
/* 326 */         int to_bitField0_ = 0;
/* 327 */         if ((from_bitField0_ & 0x1) == 1) {
/* 328 */           to_bitField0_ |= 0x1;
/*     */         }
/* 330 */         result.isSuccess_ = this.isSuccess_;
/* 331 */         result.bitField0_ = to_bitField0_;
/* 332 */         onBuilt();
/* 333 */         return result;
/*     */       }
/*     */       
/*     */       public Builder mergeFrom(Message other) {
/* 337 */         if ((other instanceof S2CLoginMsg.Login)) {
/* 338 */           return mergeFrom((S2CLoginMsg.Login)other);
/*     */         }
/* 340 */         super.mergeFrom(other);
/* 341 */         return this;
/*     */       }
/*     */       
/*     */       public Builder mergeFrom(S2CLoginMsg.Login other)
/*     */       {
/* 346 */         if (other == S2CLoginMsg.Login.getDefaultInstance()) return this;
/* 347 */         if (other.hasIsSuccess()) {
/* 348 */           setIsSuccess(other.getIsSuccess());
/*     */         }
/* 350 */         mergeUnknownFields(other.getUnknownFields());
/* 351 */         return this;
/*     */       }
/*     */       
/*     */       public final boolean isInitialized() {
/* 355 */         if (!hasIsSuccess())
/*     */         {
/* 357 */           return false;
/*     */         }
/* 359 */         return true;
/*     */       }
/*     */       
/*     */       /* Error */
/*     */       public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry)
/*     */         throws IOException
/*     */       {
	return null;
/*     */         // Byte code:
/*     */         //   0: aconst_null
/*     */         //   1: astore_3
/*     */         //   2: getstatic 135	protobuf/S2CLoginMsg$Login:PARSER	Lcom/google/protobuf/Parser;
/*     */         //   5: aload_1
/*     */         //   6: aload_2
/*     */         //   7: invokeinterface 139 3 0
/*     */         //   12: checkcast 26	protobuf/S2CLoginMsg$Login
/*     */         //   15: astore_3
/*     */         //   16: goto +32 -> 48
/*     */         //   19: astore 4
/*     */         //   21: aload 4
/*     */         //   23: invokevirtual 145	com/google/protobuf/InvalidProtocolBufferException:getUnfinishedMessage	()Lcom/google/protobuf/MessageLite;
/*     */         //   26: checkcast 26	protobuf/S2CLoginMsg$Login
/*     */         //   29: astore_3
/*     */         //   30: aload 4
/*     */         //   32: athrow
/*     */         //   33: astore 5
/*     */         //   35: aload_3
/*     */         //   36: ifnull +9 -> 45
/*     */         //   39: aload_0
/*     */         //   40: aload_3
/*     */         //   41: invokevirtual 70	protobuf/S2CLoginMsg$Login$Builder:mergeFrom	(Lprotobuf/S2CLoginMsg$Login;)Lprotobuf/S2CLoginMsg$Login$Builder;
/*     */         //   44: pop
/*     */         //   45: aload 5
/*     */         //   47: athrow
/*     */         //   48: aload_3
/*     */         //   49: ifnull +9 -> 58
/*     */         //   52: aload_0
/*     */         //   53: aload_3
/*     */         //   54: invokevirtual 70	protobuf/S2CLoginMsg$Login$Builder:mergeFrom	(Lprotobuf/S2CLoginMsg$Login;)Lprotobuf/S2CLoginMsg$Login$Builder;
/*     */         //   57: pop
/*     */         //   58: aload_0
/*     */         //   59: areturn
/*     */         // Line number table:
/*     */         //   Java source line #366	-> byte code offset #0
/*     */         //   Java source line #368	-> byte code offset #2
/*     */         //   Java source line #369	-> byte code offset #16
/*     */         //   Java source line #370	-> byte code offset #21
/*     */         //   Java source line #371	-> byte code offset #30
/*     */         //   Java source line #372	-> byte code offset #33
/*     */         //   Java source line #373	-> byte code offset #35
/*     */         //   Java source line #374	-> byte code offset #39
/*     */         //   Java source line #376	-> byte code offset #45
/*     */         //   Java source line #373	-> byte code offset #48
/*     */         //   Java source line #374	-> byte code offset #52
/*     */         //   Java source line #377	-> byte code offset #58
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	signature
/*     */         //   0	60	0	this	Builder
/*     */         //   0	60	1	input	CodedInputStream
/*     */         //   0	60	2	extensionRegistry	ExtensionRegistryLite
/*     */         //   1	53	3	parsedMessage	S2CLoginMsg.Login
/*     */         //   19	12	4	e	InvalidProtocolBufferException
/*     */         //   33	13	5	localObject	Object
/*     */         // Exception table:
/*     */         //   from	to	target	type
/*     */         //   2	16	19	com/google/protobuf/InvalidProtocolBufferException
/*     */         //   2	33	33	finally
/*     */       }
/*     */       
/*     */       public boolean hasIsSuccess()
/*     */       {
/* 387 */         return (this.bitField0_ & 0x1) == 1;
/*     */       }
/*     */       
/*     */ 
/*     */       public boolean getIsSuccess()
/*     */       {
/* 393 */         return this.isSuccess_;
/*     */       }
/*     */       
/*     */ 
/*     */       public Builder setIsSuccess(boolean value)
/*     */       {
/* 399 */         this.bitField0_ |= 0x1;
/* 400 */         this.isSuccess_ = value;
/* 401 */         onChanged();
/* 402 */         return this;
/*     */       }
/*     */       
/*     */ 
/*     */       public Builder clearIsSuccess()
/*     */       {
/* 408 */         this.bitField0_ &= 0xFFFFFFFE;
/* 409 */         this.isSuccess_ = false;
/* 410 */         onChanged();
/* 411 */         return this;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     static
/*     */     {
/* 418 */       defaultInstance = new Login(true);
/* 419 */       defaultInstance.initFields();
/*     */     }
/*     */     
/*     */     /* Error */
///*     */     private Login(CodedInputStream input, ExtensionRegistryLite extensionRegistry)
///*     */       throws InvalidProtocolBufferException
/*     */     {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokespecial 70	com/google/protobuf/GeneratedMessage:<init>	()V
/*     */       //   4: aload_0
/*     */       //   5: iconst_m1
/*     */       //   6: putfield 53	protobuf/S2CLoginMsg$Login:memoizedIsInitialized	B
/*     */       //   9: aload_0
/*     */       //   10: iconst_m1
/*     */       //   11: putfield 55	protobuf/S2CLoginMsg$Login:memoizedSerializedSize	I
/*     */       //   14: aload_0
/*     */       //   15: invokespecial 44	protobuf/S2CLoginMsg$Login:initFields	()V
/*     */       //   18: iconst_0
/*     */       //   19: istore_3
/*     */       //   20: invokestatic 83	com/google/protobuf/UnknownFieldSet:newBuilder	()Lcom/google/protobuf/UnknownFieldSet$Builder;
/*     */       //   23: astore 4
/*     */       //   25: iconst_0
/*     */       //   26: istore 5
/*     */       //   28: goto +79 -> 107
/*     */       //   31: aload_1
/*     */       //   32: invokevirtual 87	com/google/protobuf/CodedInputStream:readTag	()I
/*     */       //   35: istore 6
/*     */       //   37: iload 6
/*     */       //   39: lookupswitch	default:+31->70, 0:+25->64, 8:+50->89
/*     */       //   64: iconst_1
/*     */       //   65: istore 5
/*     */       //   67: goto +40 -> 107
/*     */       //   70: aload_0
/*     */       //   71: aload_1
/*     */       //   72: aload 4
/*     */       //   74: aload_2
/*     */       //   75: iload 6
/*     */       //   77: invokevirtual 93	protobuf/S2CLoginMsg$Login:parseUnknownField	(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
/*     */       //   80: ifne +27 -> 107
/*     */       //   83: iconst_1
/*     */       //   84: istore 5
/*     */       //   86: goto +21 -> 107
/*     */       //   89: aload_0
/*     */       //   90: dup
/*     */       //   91: getfield 97	protobuf/S2CLoginMsg$Login:bitField0_	I
/*     */       //   94: iconst_1
/*     */       //   95: ior
/*     */       //   96: putfield 97	protobuf/S2CLoginMsg$Login:bitField0_	I
/*     */       //   99: aload_0
/*     */       //   100: aload_1
/*     */       //   101: invokevirtual 99	com/google/protobuf/CodedInputStream:readBool	()Z
/*     */       //   104: putfield 103	protobuf/S2CLoginMsg$Login:isSuccess_	Z
/*     */       //   107: iload 5
/*     */       //   109: ifeq -78 -> 31
/*     */       //   112: goto +49 -> 161
/*     */       //   115: astore 5
/*     */       //   117: aload 5
/*     */       //   119: aload_0
/*     */       //   120: invokevirtual 105	com/google/protobuf/InvalidProtocolBufferException:setUnfinishedMessage	(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;
/*     */       //   123: athrow
/*     */       //   124: astore 5
/*     */       //   126: new 81	com/google/protobuf/InvalidProtocolBufferException
/*     */       //   129: dup
/*     */       //   130: aload 5
/*     */       //   132: invokevirtual 109	java/io/IOException:getMessage	()Ljava/lang/String;
/*     */       //   135: invokespecial 115	com/google/protobuf/InvalidProtocolBufferException:<init>	(Ljava/lang/String;)V
/*     */       //   138: aload_0
/*     */       //   139: invokevirtual 105	com/google/protobuf/InvalidProtocolBufferException:setUnfinishedMessage	(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;
/*     */       //   142: athrow
/*     */       //   143: astore 7
/*     */       //   145: aload_0
/*     */       //   146: aload 4
/*     */       //   148: invokevirtual 118	com/google/protobuf/UnknownFieldSet$Builder:build	()Lcom/google/protobuf/UnknownFieldSet;
/*     */       //   151: putfield 63	protobuf/S2CLoginMsg$Login:unknownFields	Lcom/google/protobuf/UnknownFieldSet;
/*     */       //   154: aload_0
/*     */       //   155: invokevirtual 123	protobuf/S2CLoginMsg$Login:makeExtensionsImmutable	()V
/*     */       //   158: aload 7
/*     */       //   160: athrow
/*     */       //   161: aload_0
/*     */       //   162: aload 4
/*     */       //   164: invokevirtual 118	com/google/protobuf/UnknownFieldSet$Builder:build	()Lcom/google/protobuf/UnknownFieldSet;
/*     */       //   167: putfield 63	protobuf/S2CLoginMsg$Login:unknownFields	Lcom/google/protobuf/UnknownFieldSet;
/*     */       //   170: aload_0
/*     */       //   171: invokevirtual 123	protobuf/S2CLoginMsg$Login:makeExtensionsImmutable	()V
/*     */       //   174: return
/*     */       // Line number table:
/*     */       //   Java source line #57	-> byte code offset #0
/*     */       //   Java source line #144	-> byte code offset #4
/*     */       //   Java source line #166	-> byte code offset #9
/*     */       //   Java source line #61	-> byte code offset #14
/*     */       //   Java source line #62	-> byte code offset #18
/*     */       //   Java source line #64	-> byte code offset #20
/*     */       //   Java source line #63	-> byte code offset #23
/*     */       //   Java source line #66	-> byte code offset #25
/*     */       //   Java source line #67	-> byte code offset #28
/*     */       //   Java source line #68	-> byte code offset #31
/*     */       //   Java source line #69	-> byte code offset #37
/*     */       //   Java source line #71	-> byte code offset #64
/*     */       //   Java source line #72	-> byte code offset #67
/*     */       //   Java source line #74	-> byte code offset #70
/*     */       //   Java source line #75	-> byte code offset #74
/*     */       //   Java source line #74	-> byte code offset #77
/*     */       //   Java source line #75	-> byte code offset #80
/*     */       //   Java source line #76	-> byte code offset #83
/*     */       //   Java source line #78	-> byte code offset #86
/*     */       //   Java source line #81	-> byte code offset #89
/*     */       //   Java source line #82	-> byte code offset #99
/*     */       //   Java source line #67	-> byte code offset #107
/*     */       //   Java source line #87	-> byte code offset #112
/*     */       //   Java source line #88	-> byte code offset #117
/*     */       //   Java source line #89	-> byte code offset #124
/*     */       //   Java source line #90	-> byte code offset #126
/*     */       //   Java source line #91	-> byte code offset #130
/*     */       //   Java source line #90	-> byte code offset #135
/*     */       //   Java source line #91	-> byte code offset #138
/*     */       //   Java source line #90	-> byte code offset #142
/*     */       //   Java source line #92	-> byte code offset #143
/*     */       //   Java source line #93	-> byte code offset #145
/*     */       //   Java source line #94	-> byte code offset #154
/*     */       //   Java source line #95	-> byte code offset #158
/*     */       //   Java source line #93	-> byte code offset #161
/*     */       //   Java source line #94	-> byte code offset #170
/*     */       //   Java source line #96	-> byte code offset #174
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	signature
/*     */       //   0	175	0	this	Login
/*     */       //   0	175	1	input	CodedInputStream
/*     */       //   0	175	2	extensionRegistry	ExtensionRegistryLite
/*     */       //   19	2	3	mutable_bitField0_	int
/*     */       //   23	140	4	unknownFields	com.google.protobuf.UnknownFieldSet.Builder
/*     */       //   26	82	5	done	boolean
/*     */       //   115	3	5	e	InvalidProtocolBufferException
/*     */       //   124	7	5	e	IOException
/*     */       //   35	41	6	tag	int
/*     */       //   143	16	7	localObject	Object
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   25	112	115	com/google/protobuf/InvalidProtocolBufferException
/*     */       //   25	112	124	java/io/IOException
/*     */       //   25	143	143	finally
/*     */     }
/*     */   }
/*     */   
/*     */   public static Descriptors.FileDescriptor getDescriptor()
/*     */   {
/* 433 */     return descriptor; }
/*     */   
/*     */   public static void registerAllExtensions(ExtensionRegistry registry) {}
/*     */   
/*     */   static {
/* 438 */     String[] descriptorData = {
/* 439 */       "\n\023s2c/Login_c2s.proto\022#com.playmore.game.mhqx.cmd.protobuf\"\032\n\005Login\022\021\n\tisSuccess\030\001 \002(\bB\rB\013S2CLoginMsg" };
/*     */     
/*     */ 
/*     */ 
/* 443 */     Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = 
/* 444 */       new Descriptors.FileDescriptor.InternalDescriptorAssigner()
/*     */       {
/*     */         public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
/* 447 */           S2CLoginMsg.descriptor = root;
/* 448 */           S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor = 
/* 449 */             (Descriptors.Descriptor)S2CLoginMsg.getDescriptor().getMessageTypes().get(0);
/* 450 */           S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_fieldAccessorTable = 
/* 451 */             new GeneratedMessage.FieldAccessorTable(
/* 452 */             S2CLoginMsg.internal_static_com_playmore_game_mhqx_cmd_protobuf_Login_descriptor, 
/* 453 */             new String[] { "IsSuccess" });
/* 454 */           return null;
/*     */         }
/*     */         
/* 457 */       };
/* 458 */       Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, 
/* 459 */         new Descriptors.FileDescriptor[0], 
/* 460 */         assigner);
/*     */     }
/*     */     
/*     */     public static abstract interface LoginOrBuilder
/*     */       extends com.google.protobuf.MessageOrBuilder
/*     */     {
/*     */       public abstract boolean hasIsSuccess();
/*     */       
/*     */       public abstract boolean getIsSuccess();
/*     */     }
/*     */   }


/* Location:              G:\guajiProject\ProjectS\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\protobuf\S2CLoginMsg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */