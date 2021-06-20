package net.mithunmathew.designpatterns;

class Singleton{
	
	private static Singleton obj = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(obj == null) {
			synchronized(Singleton.class) {
				if(obj == null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
		
	}
}

public class SingletonPattern {
	
	public static void main(String args[]) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1.hashCode() == obj2.hashCode()) {
			System.out.println("Same object returned");
		}
		else {
			System.out.println("Different objects returned");
		}
	}
}
