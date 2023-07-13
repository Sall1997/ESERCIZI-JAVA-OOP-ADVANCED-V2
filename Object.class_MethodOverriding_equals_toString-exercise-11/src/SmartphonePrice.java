import java.util.Objects;

/**
 * The type Smartphone price.
 */
public class SmartphonePrice implements Cloneable {
    private String priceType;
     private double priceInEuros;

    /**
     * Instantiates a new Smartphone price.
     *
     * @param priceType    the price type
     * @param priceInEuros the price in euros
     */
    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "priceType = '" + priceType + '\'' +
                ", priceInEuros = " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}