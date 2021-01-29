package javaleads.lesson2;

abstract class Vehicle {
	private String type;
	private int capacity;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void printVehicleDetails(String details) {
		System.out.println("This vehicle is not specified");
	}
	abstract public void runVehicle();
}
