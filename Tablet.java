package electronic_devices;

/**
 * Derived class
 * Represents a tablet.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 4.10.23
 */
public class Tablet extends Device {
    private String color;
    private String madeIn;

    /**
     * Creates a tablet with implemented parameters from superclass Device (type, price, weight)
     * and specified color, madeIn.
     * @param type
     * @param price
     * @param weight
     * @param color
     * @param madeIn
     */
    public Tablet(String type, double price, double weight, String color, String madeIn) {
        super(type, price, weight);
        this.color = color;
        this.madeIn = madeIn;
    }

    /**
     * Gets a color of tablet.
     * @return A String representing tablet's color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets a color of tablet.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets a madeIn of tablet.
     * @return A String representing tablet's madeIn.
     */
    public String getMadeIn() {
        return madeIn;
    }

    /**
     * Sets a madeIn of tablet.
     * @param madeIn
     */
    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    /**
     * Return a string representation of the object.
     * @return A String representing tablet and its properties.
     */
    @Override
    public String toString() {
        return "Tablet {" +
                "price = " + getPrice() +
                ", weight = " + getWeight() +
                ", color = " + color +
                ", madeIn = " + madeIn + "}";
    }
}
