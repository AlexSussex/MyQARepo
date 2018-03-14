package GarageExercise;

public class Van extends Vehicle {
	private boolean hasARearDoor;
	private int maxLoad;
	private int maxLoadHeight;
	private int maxLoadWidth;
	
	public Van() {
		this.setNumberOfWheels(4);
	}
	
	public Van (String name, int id) {
		this.setNumberOfWheels(4);
	}
	public Van (String name, int id, String type) {
		this.setNumberOfWheels(4);
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public int getMaxLoadHeight() {
		return maxLoadHeight;
	}

	public void setMaxLoadHeight(int maxLoadHeight) {
		this.maxLoadHeight = maxLoadHeight;
	}

	public int getMaxLoadWidth() {
		return maxLoadWidth;
	}

	public void setMaxLoadWidth(int maxLoadWidth) {
		this.maxLoadWidth = maxLoadWidth;
	}

}
