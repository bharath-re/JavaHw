package HW1;
// Here we are Using Interface instead of Abstract class , here we cannot declare a method ,
// we are using implements keyword for this and by default the methods are public abstract
interface Laptop {
    void brand();
    void config();
}

class Hp implements Laptop {
    @Override
    public void brand() {
        System.out.println("The brand is Hp pavilion X-360 ");
    }

    @Override
    public void config() {
        System.out.println("The Config of Laptop is 8 GB RAM , 1 TB HardDisk, 14 Inch Screen");

    }
}
class InheritanceImp {
    public static void main(String[] args) {

        Laptop l1=new Hp();
        l1.brand();
        l1.config();



    }

}
