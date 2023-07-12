/**
 * The type Boat.
 */
public class Boat extends Vehicle {
    /**
     * The Max knots speed.
     */
    double maxKnotsSpeed;
    /**
     * The Boat kilos weight.
     */
    int boatKilosWeight;

    /**
     * Instantiates a new Boat.
     *
     * @param maxKnotsSpeed   the max knots speed
     * @param boatKilosWeight the boat kilos weight
     */
    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        this.type = "Boat";
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    /**
     * Gets max knots speed.
     *
     * @return the max knots speed
     */
    public double getMaxKnotsSpeed() {
        return maxKnotsSpeed;
    }

    /**
     * Sets max knots speed.
     *
     * @param maxKnotsSpeed the max knots speed
     */
    public void setMaxKnotsSpeed(double maxKnotsSpeed) {
        this.maxKnotsSpeed = maxKnotsSpeed;
    }

    /**
     * Gets boat kilos weight.
     *
     * @return the boat kilos weight
     */
    public int getBoatKilosWeight() {
        return boatKilosWeight;
    }

    /**
     * Sets boat kilos weight.
     *
     * @param boatKilosWeight the boat kilos weight
     */
    public void setBoatKilosWeight(int boatKilosWeight) {
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    void doVehicleSound() {
        System.out.println("wooom...");
    }

    /**
     * Get boat weight and speed string.
     *
     * @return the string
     */
    public String getBoatWeightAndSpeed(){
        return "Total weight: " + this.boatKilosWeight + " kg" + "; Maximum speed knots: " + this.maxKnotsSpeed;
    }
}
