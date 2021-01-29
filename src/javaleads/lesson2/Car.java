package javaleads.lesson2;

public class Car extends Vehicle{
	private int engineCount;
	public void printVehicleDetails(String details) {
		System.out.println("This vehicle is a car");
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void runVehicle() {
		
	}

	public int getEngineCount() {
		return engineCount;
	}

	public void setEngineCount(int engineCount) {
		this.engineCount = engineCount;
	}

}
