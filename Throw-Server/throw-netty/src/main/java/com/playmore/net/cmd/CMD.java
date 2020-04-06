package com.playmore.net.cmd;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface CMD {
  short cmd();
  
  String parseMethod() default "parseFrom";
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\cmd\CMD.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */