package net.mithunmathew.designpatterns;

import java.util.ArrayList;

interface Command{
	
	void execute();
	
}

class Actions{
	
	public void action1() {
		
		System.out.println("Performed Action 1");
		
	}
	
	public void action2() {
		
		System.out.println("Performed Action 2");
		
	}

	public void action3() {
		
		System.out.println("Performed Action 3");
		
	}
}

class ActionExecution1 implements Command {
	
	private Actions actions;
	
	ActionExecution1(Actions act){
		
		this.actions = act;
		
	}
	
	public void execute() {
		
		actions.action1();
		System.out.println();
		
	}
}

class ActionExecution2 implements Command {
	
	private Actions actions;
	
	ActionExecution2(Actions act){
		
		this.actions = act;
		
	}
	
	public void execute() {
		
		actions.action2();
		System.out.println();
		
	}
}

class ActionExecution3 implements Command {
	
	private Actions actions;
	
	ActionExecution3(Actions act){
		
		this.actions = act;
		
	}
	
	public void execute() {
		
		actions.action3();
		System.out.println();
		
	}
}

class ComplexAction implements Command {
	
	private Actions actions;
	
	ComplexAction(Actions act){
		
		this.actions = act;
		
	}
	
	public void execute() {
		
		actions.action1();
		actions.action3();
		System.out.println();
		
	}
}

class ActionInvoker{
	
	private ArrayList<Command> actionList;
	
	ActionInvoker(){
		
		actionList  = new ArrayList<Command>();
		
	}
	
	void addAction(Command action) {
		
		actionList.add(action);
		
	}
	
	void executeActions() {
		
		for(Command command: actionList) {
			command.execute();
		}
		actionList.clear();
		
	}
	
}

public class CommandPattern {
	
	public static void main(String args[]) {
		
		Actions action = new Actions();
		
		ActionExecution1 act1 = new ActionExecution1(action);
		ActionExecution2 act2 = new ActionExecution2(action);
		ActionExecution3 act3 = new ActionExecution3(action);
		ComplexAction act4 = new ComplexAction(action);
		
		ActionInvoker invoker = new ActionInvoker();
		
		invoker.addAction(act1);
		invoker.addAction(act2);
		invoker.addAction(act3);
		invoker.addAction(act4);
		
		invoker.executeActions();
		
	}

}
