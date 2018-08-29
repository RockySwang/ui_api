package com.example.impl;

/*Java 中的双重检查（Double-Check）double check*/
class Singleton{
	private volatile static Singleton instance = null;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null)
					instance = new Singleton();
				}
			}
		return instance;
		}
	}