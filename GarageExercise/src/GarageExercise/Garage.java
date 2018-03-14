package GarageExercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {
		Car car1 = new Car("Renault", 1, "car");
		car1.isVehicleFixed = false;
		Motorcycle motor1 = new Motorcycle("Suzuki", 3, "motorcycle");
		motor1.isVehicleFixed = true;
		Van van1 = new Van("Ford", 5, "van");
		van1.isVehicleFixed = true;
		List<Vehicle> myVehicles = new ArrayList<Vehicle>();
		myVehicles.add(car1);
		myVehicles.add(motor1);
		myVehicles.add(van1);
		fixVehiclesCalculateBill(myVehicles);
		removeVehicleFromList(myVehicles, 15, "car");

	}

	public static List<Vehicle> fixVehiclesCalculateBill(List<Vehicle> vehicles) {
		Car car1 = new Car("Renault", 1, "car");
		car1.isVehicleFixed = false;
		Motorcycle motor1 = new Motorcycle("Suzuki", 3, "motorcycle");
		motor1.isVehicleFixed = true;
		Van van1 = new Van("Ford", 5, "van");
		van1.isVehicleFixed = true;
		vehicles.add(car1);
		vehicles.add(motor1);
		vehicles.add(van1);

		for (Vehicle vehicle : vehicles) {
			if ((vehicle.equals(car1)) && (vehicle.isVehicleFixed == true)) {
				fixVehicle();
				System.out.println("The bill for the car £250");
			} else if ((vehicle.equals(car1)) && (vehicle.isVehicleFixed == false)) {
				System.out.println("The car needs to remain in our garage for further repairings." + "\n");
			}

			if ((vehicle.equals(motor1)) && (vehicle.isVehicleFixed == true)) {
				fixVehicle();
				System.out.println("The bill for the motorcycle is £175" + "\n");
			} else if ((vehicle.equals(motor1)) && (vehicle.isVehicleFixed == false)) {
				System.out.println("The motorcycle needs to remain in our garage for further repairings." + "\n");
			}
			if ((vehicle.equals(van1)) && (vehicle.isVehicleFixed == true)) {
				fixVehicle();
				System.out.println("The bill for the van is £335" + "\n");
			} else if ((vehicle.equals(van1)) && (vehicle.isVehicleFixed == false)) {
				System.out.println("The van needs to remain in our garage for further repairings." + "\n");
			}
		}
		return vehicles;
	}

	public static void removeVehicleFromList(List<Vehicle> myVehicles, int id, String type) {

		for (Vehicle vehicle : myVehicles) {
			if ((vehicle.getId() == id) || (vehicle.getVehicleType() == type)) {
				System.out.println(
						"the id is " + vehicle.getId() + "; the type of the vehicle is " + vehicle.getVehicleType());
				myVehicles.remove(vehicle);
			}
		}
		if (myVehicles.isEmpty()) {
			emptyGarage(myVehicles);
		}
	}

	public static void emptyGarage(List<Vehicle> myVehicles) {
		myVehicles.removeAll(myVehicles);
		System.out.println("All the vehicles have been taken out from the garage");
	}

	public static void fixVehicle() {
		System.out.println("Your vehicle has been fixed. Proceeding to calculate your bill...");
	}
}
