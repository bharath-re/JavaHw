package HW1;

class LaptopD {
    private String brand;
    private int ram;
    private int storage;

    public LaptopD(String brand,int ram,int storage){
        this.brand=brand;
        this.ram=ram;
        this.storage=storage;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

class GamingLaptop extends LaptopD {

    private String gpu;

    public GamingLaptop(String brand,int ram,int storage, String gpu){
        super(brand,ram,storage);
        this.gpu=gpu;

    }
    public void displayGamingLaptopDetails(){
        this.displayDetails();
    }


}

public class ThisAndSuperImp {
    public static void main(String[] args) {

        LaptopD laptop = new LaptopD("Dell", 8, 256);
        laptop.displayDetails();

        System.out.println();

        // Creating a GamingLaptop object
        GamingLaptop gamingLaptop = new GamingLaptop("Asus", 16, 512, "NVIDIA RTX 3080");
        gamingLaptop.displayGamingLaptopDetails();

    }
}

// this is from current class
// super is from parent class


