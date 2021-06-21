package net.mithunmathew.designpatterns;

interface Vehicle{
	
	public void showModel();
	
}

class Car implements Vehicle{
	
	public void showModel() {
		
		System.out.println("Car");
		
	}
	
}

class Bike implements Vehicle{
	
	public void showModel() {
		
		System.out.println("Bike");
		
	}
	
}

class Truck implements Vehicle{
	
	public void showModel() {
		
		System.out.println("Truck");
		
	}
	
}

class VehicleFacade{
	
	private Vehicle car;
	private Vehicle bike;
	private Vehicle truck;
	
	public VehicleFacade(){
		
		car = new Car();
		bike = new Bike();
		truck = new Truck();
		
	}
	
	public void showCar() {
		car.showModel();	
	}
	
	public void showBike() {
		bike.showModel();	
	}
	
	public void showTruck() {
		truck.showModel();	
	}
	
}

public class FacadePattern {
	
	public static void main(String args[]) {
		
		VehicleFacade facade = new VehicleFacade();
		facade.showCar();
		facade.showBike();
		facade.showTruck();
		
	}

}
