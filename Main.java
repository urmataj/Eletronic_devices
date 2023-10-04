package electronic_devices;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of devices you want to create: ");
        int numOfDev = scanner.nextInt();
        double totalPrice = 0;
        double totalWeight = 0;
        int numOfPhone = 0;
        int numOfLaptop = 0;
        int numOfTablet = 0;

        if (numOfDev > 0 && numOfDev < 21) {
            for (int i = 0; i < numOfDev; i++) {
                int device = random.nextInt(1,4);
                if (device == 1) {
                    double price = random.nextDouble(400,800);
                    double weight = random.nextDouble(150, 300);
                    double screenSize = random.nextDouble(4,10);
                    int cameraResolution = random.nextInt(10, 20);
                    Smartphone smartphone = new Smartphone("Smartphone", Math.round(price * 100.0)/100.0, Math.round(weight * 100.0)/100.0, Math.round(screenSize * 100.0)/100.0, cameraResolution);
                    System.out.println(smartphone);
                    totalPrice += price;
                    totalWeight += weight;
                    numOfPhone++;
                }
                if (device == 2) {
                    double price = random.nextDouble();
                    double weight = random.nextDouble();
                    int memory = random.nextInt();
                    String[] CPU = {"Intel Core i5", "Intel Core i7", "Intel Core i9"};
                    int selectCPU = random.nextInt(CPU.length);
                    Laptop laptop = new Laptop("Laptop", Math.round(price * 100.0)/100.0, Math.round(weight * 100.0)/100.0, memory, CPU[selectCPU]);
                    System.out.println(laptop);
                    totalPrice += price;
                    totalWeight += weight;
                    numOfLaptop++;
                }
                if (device == 3) {
                    double price = random.nextDouble();
                    double weight = random.nextDouble();
                    String[] color = {"Indigo", "Galaxy", "Silver"};
                    int selectColor = random.nextInt(color.length);
                    String[] madeIn = {"China", "USA", "Germany"};
                    int selectMadeIn = random.nextInt(madeIn.length);
                    Tablet tablet = new Tablet("Tablet", Math.round(price * 100.0)/100.0, Math.round(weight * 100.0)/100.0, color[selectColor], madeIn[selectMadeIn]);
                    System.out.println(tablet);
                    totalPrice += price;
                    totalWeight += weight;
                    numOfTablet++;
                }
            }
        }
        System.out.println("The total price of all devices: " + Math.round(totalPrice * 100.0)/100.0);
        System.out.println("The total weight of all devices: " + Math.round(totalWeight * 100.0)/100.0);
        System.out.println("The number of distinct device types created { " + "Smartphone: " + numOfPhone + ", Laptop: " + numOfLaptop + ", Tablet: " + numOfTablet + "}");
    }
}
