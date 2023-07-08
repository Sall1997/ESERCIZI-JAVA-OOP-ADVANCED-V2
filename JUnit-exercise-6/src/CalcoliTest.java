import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcoliTest {

    @Test
    void testSubtraction() {
        int result = Calcoli.subtraction(6,2);
        assertEquals(4, result,"Il risultato è corretto");
    }

    @Test
    void maxValueSubtraction(){
        int result = Calcoli.subtraction( 2147483647,Integer.MAX_VALUE);
        assertEquals(1, result, "non superare il valore 2147483647 e il valore -2147483648 ");
    }

    @Test
    void testMultiplication() {
        int result = Calcoli.multiplication(5, 6);
        assertEquals(30, result,"Il risultato è corretto");
    }

    @Test
    void limitMultiplication(){
        int result = Calcoli.multiplication(2147483647,2);
        assertEquals(429496729,result,"il risultato è 4294967294. ma non può superare ne 2147483647 ne -2147483648"  +
                                                        " perchè non si hanno valori affidabili. Inoltre su expected ho" +
                                                        "dovuto mettere una cifra in meno perchè non accetta ulteriori cifre ");
    }
}