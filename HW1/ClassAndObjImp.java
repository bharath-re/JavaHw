package HW1;

//This is class named Car and we have two methods for this, Which are speed and colour

class Car {
    public void speed(int speed){
        System.out.println("Speed of car is "+ speed + " Miles/hr");
    }
    public void colour(String colour){
        System.out.println("Color of Car is "+ colour);
    }
}

public class ClassAndObjImp {


    // This is main method

    public static void main(String[] args) {


        // Here we are Creating a object of car which is obj1 and we can create various number of objects.
        //1. you can use same obj1 to create various number of objects or you can still Create a new object like obj2


        Car obj1=new Car();
        obj1.speed(90);
        obj1.colour("Red");

        obj1.speed(70);
        obj1.colour("Green");


        Car obj2=new Car();
        obj2.speed(80);
        obj2.colour("Blue");

    }
}
