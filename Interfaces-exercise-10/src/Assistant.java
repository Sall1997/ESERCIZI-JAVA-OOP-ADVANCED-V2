/**
 * The type Assistant.
 */
public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{
    /**
     * The Is going to be a ph d.
     */
    boolean isGoingToBeAPhD;

    /**
     * Instantiates a new Assistant.
     *
     * @param name       the name
     * @param surname    the surname
     * @param id         the id
     * @param willBeAPhD the will be a ph d
     */
    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    /**
     * Is going to be a ph d boolean.
     *
     * @return the boolean
     */
    public boolean isGoingToBeAPhD() {
        return isGoingToBeAPhD;
    }

    /**
     * Sets going to be a phd.
     *
     * @param goingToBeAPhD the going to be a phd
     */
    public void setGoingToBeAPhD(boolean goingToBeAPhD) {
        isGoingToBeAPhD = goingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("L'assistente " + name + " sta insegnando...");

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("L'assistente " + name + " studia a casa");
    }
}
