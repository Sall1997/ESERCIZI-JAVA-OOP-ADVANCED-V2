/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal leone = new Animal("Leone");

        leone.animalSound();
        leone.animalSound("low");
        leone.animalSound("high");
        leone.animalSound("test");
    }
}
