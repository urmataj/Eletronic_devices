package electronic_devices;

/**
 * Derived class
 * Represents a smartphone.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 4.10.23
 */
public class Smartphone extends Device {
    private double screenSize;
    private int cameraResolution;

    /**
     * Creates a smartphone with implemented parameters from superclass Device (type, price, weight)
     * and specified screen size, camera resolution.
     * @param type
     * @param price
     * @param weight
     * @param screenSize
     * @param cameraResolution
     */
    public Smartphone(String type, double price, double weight, double screenSize, int cameraResolution) {
        super(type, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    /**
     * Gets screen size of smartphone.
     * @return A double representing smartphone's screen size.
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     * Sets a screen size of smartphone.
      * @param screenSize
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Gets camera resolution of a smartphone.
     * @return A double representing smartphone's camera resolution.
     */
    public int getCameraResolution() {
        return cameraResolution;
    }

    /**
     * Sets a camera resolution of smartphone.
     * @param cameraResolution
     */
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    /**
     * Return a string representation of the object.
     * @return A String representing smartphone and its properties.
     */
    @Override
    public String toString() {
        return "Smartphone {" +
                "price = " + getPrice() +
                ", weight = " + getWeight() +
                ", + screenSize = " + screenSize +
                ", + cameraResolution = " + cameraResolution + "}";
    }
}
