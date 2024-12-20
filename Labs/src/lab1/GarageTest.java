package lab1;

import java.util.Vector;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage("Kokenov Erasyl");
        
        Vehicle car1 = new Vehicle("1HGCM82633A123456", "Honda", "Accord", VehicleType.CAR);
        Vehicle car2 = new Vehicle("1FMCU0G73DUB12345", "Ford", "Escape", VehicleType.TRUCK);
        Vehicle bike1 = new Vehicle("JH2SC5908JK123456", "Honda", "CBR", VehicleType.MOTORCYCLE);

        garage.addVehicle(car1);
        garage.addVehicle(car2);
        
        Vector<Vehicle> newVehicles = new Vector<>();
        newVehicles.add(bike1);
        garage.addVehicle(newVehicles);
        
        System.out.println(garage);
        
        garage.removeVehicle(car1);
        garage.removeVehicle("1FMCU0G73DUB12345");

        System.out.println("After removing vehicles:\n" + garage);
    }
}
