package HW1;


public class CarZ {
    private String brand;
    private String model;
    private int year;

    // Constructor with parameters
    public CarZ(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter methods (not part of the constructor, but used to access object properties)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating an object of Car class using the constructor
        CarZ myCar = new CarZ("Toyota", "Camry", 2022);

        // Accessing object properties using getter methods
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
