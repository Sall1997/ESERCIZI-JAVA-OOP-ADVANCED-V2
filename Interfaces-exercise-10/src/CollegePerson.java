/**
 * The type College person.
 */
public class  CollegePerson {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Surname.
     */
    protected String surname;
    /**
     * The College id.
     */
    protected int collegeId;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets surname.
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets college id.
     *
     * @return the college id
     */
    public int getCollegeId() {
        return collegeId;
    }

    /**
     * Sets college id.
     *
     * @param collegeId the college id
     */
    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * Go to college.
     */
    public void goToCollege(){
        System.out.println("name: " + name + "; surname: "+ surname + "; college Id: "+ collegeId);
    }

}
