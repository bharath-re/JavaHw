package HW1;


//Runtime Polymorphism (Method Overriding)
//In method overriding, a subclass provides a specific implementation for a method that is already defined in its superclass.

class Animalz {
    public void sound() {
        System.out.println("Animal makes some sound");
    }
}

class Dogz extends Animalz {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Catz extends Animalz {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Polyimp2 {
    public static void main(String[] args) {
        Animalz animal = new Animalz();
        animal.sound(); // Outputs: Animal makes some sound

        Animalz dog = new Dogz();
        dog.sound(); // Outputs: The dog barks

        Animalz cat = new Catz();
        cat.sound(); // Outputs: The cat meows
    }
}
