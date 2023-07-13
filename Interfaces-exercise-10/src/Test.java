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

        Professor professor1 = new Professor("Giancarlo", "Rossi", 1,"Matematica");
        Student student1 = new Student("Marco","Verdi", 300,5 );
        Assistant assistant1 = new Assistant("Pietro","Bianchi",31,true);

        professor1.goToCollege();
        student1.goToCollege();
        assistant1.goToCollege();

        professor1.teachToOtherPeople();
        student1.studyAtHome();
        assistant1.teachToOtherPeople();
        assistant1.studyAtHome();
    }
}
