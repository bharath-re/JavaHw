package HW1.AccessModifiers;

class Animal {
    // This Public Variable is public, so they can be accessed from anywhere.(from any package and class )
    public String aName;

    // class are private, so they can only be accessed within the Animal class.
    private int age;

    // Protected variable: accessible within this package and subclasses
    protected String typeOfAnimal;

    // Default variable: accessible only within this package

    String typeOfFood;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class AccessModifersImp {

    public static void main(String[] args) {

    }

}
