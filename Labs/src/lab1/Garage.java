package lab1;

import java.util.Vector;

public class Garage {
    private static String owner;
    private int vehicleCount;
    private static final int MAX_CAPACITY = 100;
    private Vector<Vehicle> carList = new Vector<>();

    {
        owner = "Unknown";
        vehicleCount = 0;
    }

    public Garage() {
    }

    public Garage(String owner) {
        this.owner = owner;
    }

    public Garage(Vehicle v) {
        this.carList.add(v);
        vehicleCount++;
    }

    public Garage(String owner, Vehicle v) {
        this(owner);
        this.carList.add(v);
        vehicleCount++;
    }

    public Garage(Vector<Vehicle> carList) {
        this.carList = carList;
        vehicleCount = carList.size();
    }

    public Garage(String owner, Vector<Vehicle> carList) {
        this(owner);
        this.carList = carList;
        vehicleCount = carList.size();
    }

    public void addVehicle(Vehicle v) {
        if (vehicleCount < MAX_CAPACITY) {
            this.carList.add(v);
            vehicleCount++;
        } else {
            System.out.println("Garage is full. Cannot add more vehicles.");
        }
    }

    public void addVehicle(Vector<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            addVehicle(v);
        }
    }

    public void removeVehicle(Vehicle v) {
        if (carList.remove(v)) {
            vehicleCount--;
        }
    }

    public void removeVehicle(String vin) {
        for (Vehicle vehicle : carList) {
            if (vehicle.getVinNumber().equals(vin)) {
                removeVehicle(vehicle);
                break;
            }
        }
    }

    public int getMaxCapacity() {
        return this.MAX_CAPACITY;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getNumberOfVehicles() {
        return this.vehicleCount;
    }

    @Override
    public String toString() {
        return "Owner of the garage: " + owner + " and all vehicles in the garage are: \n" + carList.toString();
    }
}
