package HW1.AccessModifiers;

public class Dog extends Animal {

    public void displayInfo() {
        // Can access public variable directly
        System.out.println("Animal Name: " + aName);

        // Cannot access private variable directly
        // System.out.println("Age: " + age); // Error: age has private access in Animal

        // Can access private variable via public methods
        System.out.println("Age: " + getAge());

        // Can access protected variable directly
        System.out.println("Type of Animal: " + typeOfAnimal);

        // Can access default (package-private) variable directly
        System.out.println("Type of Food: " + typeOfFood);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.aName = "Buddy";
        dog.setAge(5);
        dog.typeOfAnimal = "Dog";
        dog.typeOfFood = "Kibble";

        dog.displayInfo();
    }
}