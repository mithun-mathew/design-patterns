package net.mithunmathew.designpatterns;

abstract class Movies{
	
	String details = "Unknown Audi";
	
	public String getDetails() {
		
		return details;
	
	}
	
	public abstract int getCost();
	
}

abstract class VASDecorator extends Movies{
	
	Movies movie;
	public abstract String getDetails();
	
}

class Audi1 extends Movies{
	
	public Audi1() { 
		details = "Audi 1"; 
	}
	
	public int getCost() {
		return 150; 
	}
	
}

class Audi2 extends Movies{
	
	public Audi2() { 
		details = "Audi 2"; 
	}
	
	public int getCost() {
		return 200; 
	}
	
}

class Audi3 extends Movies{
	
	public Audi3() { 
		details = "Audi 3"; 
	}
	
	public int getCost() {
		return 250; 
	}
	
}

class Audi4 extends Movies{
	
	public Audi4() { 
		details = "Audi 4"; 
	}
	
	public int getCost() {
		return 300; 
	}
	
}

class VAS1 extends VASDecorator{
	
	public VAS1(Movies m) { 
		this.movie = m;
	}
	
	public String getDetails() {
		
		return movie.getDetails() + ", VAS 1";
		
	}
	
	public int getCost() {
		return movie.getCost() + 50; 
	}
	
}

class VAS2 extends VASDecorator{
	
	public VAS2(Movies m) { 
		this.movie = m;
	}
	
	public String getDetails() {
		
		return movie.getDetails() + ", VAS 2";
		
	}
	
	public int getCost() {
		return movie.getCost() + 100; 
	}
	
}

class VAS3 extends VASDecorator{
	
	public VAS3(Movies m) { 
		this.movie = m;
	}
	
	public String getDetails() {
		
		return movie.getDetails() + ", VAS 3";
		
	}
	
	public int getCost() {
		return movie.getCost() + 120; 
	}
	
}

public class DecoratorPattern {
	
	public static void main(String args[]) {
	
		Movies m1 = new Audi1();
		System.out.println("Movie 1 - " + m1.getDetails() + " Cost - " + m1.getCost());
		
		Movies m2 = new Audi2();
		m2 = new VAS1(m2);
		m2 = new VAS3(m2);
		System.out.println("Movie 2 - " + m2.getDetails() + " Cost - " + m2.getCost());
	
	}
	
}
