package HW1;
// This is Abstract Class
abstract class Phone{
    // Here we Defined a method with Colour
    public void colour(){
        System.out.println("Colour of phone is Red");
    }

    // Here we haven't Defined a method , we just declared a method
    abstract public void brand();
}

class Motorola extends Phone {

    @Override
    public void brand() {
        System.out.println("The brand is Moto Razr 2024");
    }
}
public class AbstractImp {
    public static void main(String[] args) {

        Phone phone=new Motorola();
        phone.brand();
        phone.colour();
    }



}
