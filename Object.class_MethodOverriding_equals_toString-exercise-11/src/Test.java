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
        SmartphonePrice producer1 = new SmartphonePrice("€",800);
        SmartphonePrice producer2 = new SmartphonePrice("€",1200);
        SmartphonePrice retail1 = new SmartphonePrice("€",1200);
        SmartphonePrice retail2 = new SmartphonePrice("€",1200);

        Smartphone phone1 = new Smartphone
                ("Samsung", "Note 20", 4800, producer1, retail1);
        Smartphone phone2 = new Smartphone
                ("Samsung", "S22", 5000, producer1, retail1);

        System.out.println(phone1.toString());
        System.out.println();
        System.out.println(phone2.toString());

        if (phone1.equals(phone2)) {
            System.out.println("i 2 smartphone sono uguali");
        } else System.out.println("i 2 smartphone sono diversi");
        System.out.println();

        try { Smartphone clonedPhone = phone1.clone();
            System.out.println(clonedPhone.clone());

            if (clonedPhone.equals(phone1)) {
                System.out.println("i 2 smartphone sono uguali");
            }else System.out.println("i 2 smartphone sono diversi");
        } catch (Exception e) {
            System.out.println("Smartphone non clonato. Errore: " + e);
        }
    }
}