public class Test {
    public static void main(String[] args) {
        Car car = new Car(4,5,24000);
        Boat boat = new Boat(48, 205);

        car.doVehicleSound();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());

        car.showVehicleDetails();
    }
}
