package ksj.sec05.exam;

public class e04Singleton {
	private static e04Singleton singleton = new e04Singleton();
	
	private e04Singleton() {}
	
	static e04Singleton getInstance() {
		return singleton;
	}
}

