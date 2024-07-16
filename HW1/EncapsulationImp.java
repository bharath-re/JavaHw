package HW1;

class Person{

    // Here we are Using the private ,A private member is accessible only within the class in which it is declared.
    // it cannot be accessed from any other class, including subclasses.
    private int age;
    private String name;

    // we are using Getters and Setters for this methods age and name
    // These variables cannot be accessed directly from outside the class.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationImp {

    public static void main(String[] args) {

        Person p1=new Person();
        p1.setAge(45);
        p1.setName("James Anderson");

        // So here we are setting the name and Age and then printing by using getters.

        System.out.println("Name of the Cricketer : "+p1.getName());
        System.out.println("The Age of the Cricketer is : "+ p1.getAge());
    }



}
