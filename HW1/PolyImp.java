package HW1;

// This is Compile-time PloyMorphism (Method Overloading )and we have different In method overloading,
// multiple methods in the same class share the same name but have different parameters.
class Sum{
    public int add(int a , int b){
        return a+b;
    }

    public int add(int a , int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
}
public class PolyImp {
    public static void main(String[] args) {
        Sum s1=new Sum();
        System.out.println("The sum of three Integers "+s1.add(12,22,23));
        System.out.println("The sum of two  doubles is  " +s1.add(21.22,67.41));
        System.out.println("The sum of two Integers "+s1.add(90,44));

    }
}




