/*
create an enumeration Month with all the name of the months.
iterate all the values of the enumeration, printing the name of the month followed by:
- ends with y if the name ends with Y
- doesn't end with y if the name doesn't end with y
 */
public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void main(String[] args) {

        for (Months month : Months.values()) {
            if(month.toString().charAt(month.toString().length()-1) == 'Y'){
                System.out.println(month + " ends with y");
            }else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}