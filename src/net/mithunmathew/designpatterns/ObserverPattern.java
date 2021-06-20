package net.mithunmathew.designpatterns;

import java.util.ArrayList;

interface Observer{
	public void display();
}

class ObserverA implements Observer{
	
	public void display() {
		System.out.println("In ObserverA object");
	}
	
}

class ObserverB implements Observer{
	
	public void display() {
		System.out.println("In ObserverB object");
	}
	
}

class ObserverC implements Observer{
	
	public void display() {
		System.out.println("In ObserverC object");
	}
	
}

interface Subject{
	
	public void subscribe(Observer o);
	public void unsubscribe(Observer o);
	public void notifyObservers();
	
}

class Source implements Subject{
	
	ArrayList<Observer> observerList;
	
	public Source() {
		observerList = new ArrayList<Observer>();
	}
	
	public void subscribe(Observer o) {
		observerList.add(o);
	}
	
	public void unsubscribe(Observer o) {
		observerList.remove(o);
	}
	
	public void notifyObservers() {
		
		for(Observer o : observerList) {
			o.display();
		}
		
	}
	
	public void sendMessage() {
		notifyObservers();
	}
	
}

public class ObserverPattern {
	
	public static void main(String args[]) {
		
		ObserverA obs1 = new ObserverA();
		ObserverB obs2 = new ObserverB();
		ObserverC obs3 = new ObserverC();
		
		Source src = new Source();
		src.subscribe(obs1);
		src.subscribe(obs2);
		src.subscribe(obs3);
		System.out.println("Added 3 observers");
		
		src.notifyObservers();
		
		src.unsubscribe(obs2);
		System.out.println("\nUnsubscribed an observer");
		
		src.notifyObservers();
		
	}
	
}
