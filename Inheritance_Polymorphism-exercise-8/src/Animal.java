/**
 * The type Animal.
 */
public class Animal {
    private String animalName;

    /**
     * Instantiates a new Animal.
     *
     * @param animalName the animal name
     */
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    /**
     * Gets animal name.
     *
     * @return the animal name
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * Sets animal name.
     *
     * @param animalName the animal name
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     * Animal sound.
     */
    public void animalSound() {
        System.out.println("Roarr!");
    }

    /**
     * Animal sound.
     *
     * @param intensity l'intensita del suono
     */
    public void animalSound(String intensity) {
        switch (intensity) {
            case "high" -> System.out.println("Roarrrrrrrr!");
            case "low" -> System.out.println("Roar");
            default -> System.out.println("Cannot reproduce it properly: set (high) or (low) for intensity sound");
            /*
             * intelliJ ha detto che non serve il break e l'ha tolto, ma non capisco il perchè funzioni lo stesso.
             */
        }
    }
}
