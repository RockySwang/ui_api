package com.example.impl;

import java.lang.reflect.Constructor;

public class SingleTon5 {

	//用JVM的类加载和静态变量初始化特征来创建Singleton实例
	private static final SingleTon5 INSTANCE = null;

	SingleTon5 s1 = SingleTon5.INSTANCE;  
	  
	Class<SingleTon5> cls = SingleTon5.class;  
	//Constructor<SingleTon5> constructor = cls.getDeclaredConstructor(new Class[]{});  
	//constructor.setAccessible(true);  
	//SingleTon5 s2 = constructor.newInstance(new Object[] {});  
	  
	//System.out.println(s1 == s2);
}
