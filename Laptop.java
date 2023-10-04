package electronic_devices;

/**
 * Derived class
 * Represents a laptop.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 4.10.23
 */
public class Laptop extends Device {
    private int memory;
    private String CPU;

    /**
     * Creates a laptop with implemented parameters from superclass Device (type, price, weight)
     * and specified memory, CPU.
     * @param type
     * @param price
     * @param weight
     * @param memory
     * @param CPU
     */
    public Laptop(String type, double price, double weight, int memory, String CPU) {
        super(type, price, weight);
        this.memory = memory;
        this.CPU = CPU;
    }

    /**
     * Gets a memory of laptop.
     * @return An int representing laptop's memory.
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Sets a memory of laptop.
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Gets a CPU of laptop.
     * @return A String representing laptop's CPU.
     */
    public String getCPU() {
        return CPU;
    }

    /**
     * Sets a CPU of laptop.
     * @param CPU
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Return a string representation of the object.
     * @return A String representing laptop and its properties.
     */
    @Override
    public String toString() {
        return "Laptop {" +
                "price = " + getPrice() +
                ", weight = " + getWeight() +
                ", memory = " + memory +
                ", CPU = " + CPU + "}";
    }
}
