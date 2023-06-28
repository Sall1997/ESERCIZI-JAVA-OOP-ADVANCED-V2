/*
Define a testing class with a main() method where you:

-create an HashMap that maps the numbers from 1 to 5 with their respective English names;
-create an HashMap that maps the odd number from 1 to 9 with their respective Italian names;
-merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten
  in the first HashMap)
-print the modified firstHashMap
-print on screen the value of the keys 5, 6, 7, 8 and 9
-if there's no mapping for a specific key, print No associated value*/

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        int keyMappingCheck = 0;

        Map<Integer, String> numbers = new HashMap<>();
        Map<Integer, String> oddNumbers = new HashMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        oddNumbers.put(1, "Uno");
        oddNumbers.put(2, "Two");
        oddNumbers.put(3, "Tre");
        oddNumbers.put(4, "Four");
        oddNumbers.put(5, "Cinque");
        oddNumbers.put(6, "Six");
        oddNumbers.put(7, "Sette");
        oddNumbers.put(8, "eight");
        oddNumbers.put(9, "Nove");


        numbers.putAll(oddNumbers);
        System.out.println();

        // Stampa dei numeri da 5 a 9
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {

            if (entry.getKey() >= 5 && entry.getKey() <= 9) {
                System.out.println("Key = " + entry.getKey() + "; Value = " + entry.getValue());
            }
        }
        // Stampa se la mappa non contiene la chiave
        if (!numbers.containsKey(keyMappingCheck))
            System.out.println("Key = " + keyMappingCheck + ": No associated value");
    }
}
