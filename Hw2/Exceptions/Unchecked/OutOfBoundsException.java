package Hw2.Exceptions.Unchecked;

public class OutOfBoundsException {
    public static void main(String[] args) {

        String [] animals={"owl","rabbit,","Kangaroo"};
        System.out.println(animals[0]);


        // ArrayIndexOutOfBoundsException for this one because its index does not exists

        System.out.println(animals[3]);

    }
}
