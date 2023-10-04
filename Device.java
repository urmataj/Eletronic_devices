package electronic_devices;

/**
 * Base Class
 * Represents a device.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 4.10.23
 */
public class Device {
    private String type;
    private double price;
    private double weight;

    /**
     * Creates a device with specified type, price, weight.
     * @param type
     * @param price
     * @param weight
     */
    public Device(String type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    /**
     * Gets device's type.
     * @return A String representing a device type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets device's type.
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets a device's price.
     * @return A double representing device's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets a device's price.
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets a device's weight.
     * @return A double representing device's weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets a device's weight.
     * @param weight
     */
    public void setWeight(double weight) { this.weight = weight; }
}
