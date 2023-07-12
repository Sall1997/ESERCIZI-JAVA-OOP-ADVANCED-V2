/**
 * The type Car.
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    /**
     * Instantiates a new Car.
     *
     * @param wheels the wheels
     * @param doors  the doors
     * @param price  the price
     */
    public Car(int wheels, int doors, double price) {
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    /**
     * Gets number of doors.
     *
     * @return the number of doors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets number of doors.
     *
     * @param numberOfDoors the number of doors
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Gets car price.
     *
     * @return the car price
     */
    public double getCarPrice() {
        return carPrice;
    }

    /**
     * Sets car price.
     *
     * @param carPrice the car price
     */
    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    void doVehicleSound() {
        System.out.println("bruuum...");
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("number of doors: " + numberOfDoors);
    }
}
