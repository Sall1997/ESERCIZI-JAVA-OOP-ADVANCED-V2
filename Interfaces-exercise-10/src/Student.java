/**
 * The type Student.
 */
public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    /**
     * Instantiates a new Student.
     *
     * @param name    the name
     * @param surname the surname
     * @param id      the id
     * @param year    the year
     */
    public Student(String name, String surname, int id,int year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }

    /**
     * Gets academic year.
     *
     * @return the academic year
     */
    public int getAcademicYear() {
        return academicYear;
    }

    /**
     * Sets academic year.
     *
     * @param academicYear the academic year
     */
    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("lo studente " + name + " studia a casa");
    }
}
