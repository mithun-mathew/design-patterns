package net.mithunmathew.designpatterns;

interface Strategy{
	
	public void executeStrategy();
	
}

class Study implements Strategy{
	
	public void executeStrategy() {
		
		System.out.println("Studying");
		
	}
}

class Play implements Strategy{
	
	public void executeStrategy() {
		
		System.out.println("Playing");
		
	}
}

class Read implements Strategy{
	
	public void executeStrategy() {
		
		System.out.println("Reading");
		
	}
}

class Context{
	
	public Strategy strategy;
	
	public Context(Strategy strategy) {
		
		this.strategy = strategy;
		
	}
	
	public void executeStrategy() {
		
		strategy.executeStrategy();
		
	}
	
}

public class StrategyPattern {
	
	public static void main(String args[]) {
		
		Context contextObj = new Context(new Study());
		System.out.println("Using Study Strategy");
		contextObj.executeStrategy();
		
		contextObj = new Context(new Play());
		System.out.println("\nUsing Play Strategy");
		contextObj.executeStrategy();
		
		contextObj = new Context(new Read());
		System.out.println("\nUsing Read Strategy");
		contextObj.executeStrategy();
		
	}

}
