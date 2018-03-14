package GarageExercise;

public class Motorcycle extends Vehicle {
	private String ignition;
	private int minPower;
	private int maxPower;
	private String seatHeight;
	
	public Motorcycle() {
		this.setNumberOfWheels(2);
	}
	
	public Motorcycle (String name, int id) {
		this.setNumberOfWheels(2);
	}
	
	public Motorcycle (String name, int id, String type) {
		this.setNumberOfWheels(2);
	}

	public String getIgnition() {
		return ignition;
	}

	public void setIgnition(String ignition) {
		this.ignition = ignition;
	}

	public int getMinPower() {
		return minPower;
	}

	public void setMinPower(int minPower) {
		this.minPower = minPower;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public String getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(String seatHeight) {
		this.seatHeight = seatHeight;
	}

}
