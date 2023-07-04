/*
Define a method checkScore that takes a double score as input parameter:

- if 0 < score <= 50.00 then print Average score
- if 50.00 < score <= 100.00 the print Very good score
- in all other cases throw an ArithmeticException with the message Score is out of scale!

test the method with the following values:
2.15;
50;
95.02;
100.01.
 */

public class Main {
    public static void main(String[] args) {

        double score1 = 2.15;
        double score2 = 50;
        double score3 = 95.02;
        double score4 = 100.01;
        checkScore(score4);
    }

    /**
     * Controlla il punteggio inserito e stampa un messaggio in base al numero.
     *
     * @param score punteggio che si vuole controllare
     */
    public static void checkScore(double score) {
        try {
            if (score >= 0 && score <= 50) System.out.println("Average score");
            else if (score >= 50 && score <= 100) System.out.println("Very good score");
            else throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("The score: " + score + " is out of scale!");
        }
    }
}