package net.mithunmathew.designpatterns;

interface Work{
	
	public void doWork();
	
}

interface AdvancedWork {
	
	public void doAdvancedWork();
	
}

class SimpleWork implements Work{
	
	public void doWork() {
		
		System.out.println("Doing simple work");
		
	}
}

class ComplexWork implements AdvancedWork{
	
	public void doAdvancedWork() {
		
		System.out.println("Doing complex work");
		
	}
}

class WorkAdapter implements Work{
	
	AdvancedWork workObj;
	
	public WorkAdapter(){
		
		workObj = new ComplexWork();
		
	}
	
	public void doWork() {
		
		workObj.doAdvancedWork();
		
	}
}

public class AdapterPattern {
	
	public static void main(String args[]) {
		
		SimpleWork simpleObj = new SimpleWork();
		ComplexWork complexObj = new ComplexWork();
		WorkAdapter adapterObj = new WorkAdapter();
		
		System.out.println("Doing work using SimpleWork object");
		simpleObj.doWork();
		
		System.out.println("\nDoing work using ComplexWork object");
		complexObj.doAdvancedWork();
		
		System.out.println("\nDoing work using WorkAdapter object");
		adapterObj.doWork();
		
	}

}
