package GarageExercise;

public class Car extends Vehicle {
	private boolean isHatchback;
	private int numberOfDoors;
	private int numberOfGears;
	private int wheelSize;

	public Car() {
		this.setNumberOfWheels(4);

	}
	public Car(String name, int id) {
		this.setNumberOfWheels(4);
	}
	
	public Car (String name, int id, String type) {
		this.setNumberOfWheels(4);
	}

	public boolean isHatchback() {
		return isHatchback;
	}

	public void setHatchback(boolean isHatchback) {
		this.isHatchback = isHatchback;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

}
