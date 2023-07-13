/**
 * The type Professor.
 */
public class Professor extends CollegePerson implements TeachingPerson{
    private String teachingSubject;

    /**
     * Instantiates a new Professor.
     *
     * @param name    the name
     * @param surname the surname
     * @param id      the id
     * @param subject the subject
     */
    public Professor(String name, String surname, int id, String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

    /**
     * Gets teaching subject.
     *
     * @return the teaching subject
     */
    public String getTeachingSubject() {
        return teachingSubject;
    }

    /**
     * Sets teaching subject.
     *
     * @param teachingSubject the teaching subject
     */
    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("L'insegnante di " + teachingSubject + " sta insegnando");
    }
}
