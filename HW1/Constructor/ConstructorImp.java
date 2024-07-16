package HW1.Constructor;

public class ConstructorImp {
    public static void main(String[] args) {

        // This is Default Constructor ,whenever we use new keyword a new obj by Constructor method
        // is created by default, Constructor
        // Default Constructor Does not take any Arguments at all
        Home1 home1=new Home1("Hyderabad",20000000);

        System.out.println("City of House is : "+home1.city+"  || Cost of House : "+home1.cost);




    }


}
