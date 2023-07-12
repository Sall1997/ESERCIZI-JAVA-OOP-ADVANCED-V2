/**
 * The type Vehicle.
 */
public abstract class Vehicle {
    /**
     * The Type.
     */
    protected String type;
    /**
     * The Number of wheels.
     */
    protected int numberOfWheels;


    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets number of wheels.
     *
     * @return the number of wheels
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * Sets number of wheels.
     *
     * @param numberOfWheels the number of wheels
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * Show vehicle details.
     */
    public void showVehicleDetails(){
        System.out.println("Type: " + this.type + "\nnumber of wheels: " + numberOfWheels);
    }

    /**
     * Do vehicle sound.
     */
    abstract void doVehicleSound();
}
