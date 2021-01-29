package javaleads.lesson1;

public class Vehicle {
	private String model;
	private String make;
	private int plate_number;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPlate_number() {
		return plate_number;
	}
	public void setPlate_number(int plate_number) {
		this.plate_number = plate_number;
	}
	public static void main(String[] args) {
			printVehicalDetails();
			runVehicleId();

		
	}
	private static void runVehicleId() {
		Vehicle i= new Vehicle();
		i.setPlate_number(1234569);
		System.out.println(i.getPlate_number());
		
	}
	private static void printVehicalDetails() {
		Vehicle v= new Vehicle();
		v.setMake("Jeep");
		v.setModel("Wrangler");
		System.out.println(v.getMake());
		System.out.println(v.getModel());
		
	}

}
