package lab1;



public class Vehicle {

    private final String vin;


    private String brand;
    private String model;
    private VehicleType vehicleType;



    public Vehicle(String vinNumber, String brand, String model, VehicleType vehicleType) {
        this.vin = vinNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public void printDetails() {
        System.out.println("VIN: " + this.vin + ", Make: " + brand + ", Model: " + model);
    }

    public void printDetails(boolean withType) {
        if (withType) {
            System.out.println("Type: " + vehicleType + ", VIN: " + vin + ", Make: " + brand + ", Model: " + model);
        } else {
            printDetails();
        }
    }

    public String getVinNumber() {
        return vin;
    }


    public String toString() {
    	return brand + " " + model + " " + vehicleType + " with VIN number: " + vin ;
    }
}

