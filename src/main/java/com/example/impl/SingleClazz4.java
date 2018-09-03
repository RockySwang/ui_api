package com.example.impl;

/*用枚举类型来创建Singleton  （j.dk 1.5之后）,作者很喜欢用*/
public enum SingleClazz4 {  
   INSTANCE;  
   public void speak() {  
       System.out.println(this + " is speaking! ");  
   }  
}  
