package HW1.Scopes;
//  scope defines where a certain variable or method is accessible in a program
//Local variables are those that are declared inside the of a method, constructor, or code block
public class LocalScopeImp {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {

            // we can use this i within the for loop ,
            System.out.println(i);

            // End of the for loop block


        }
        // 'i' is not accessible here outside the for loop
        // System.out.println(i); // This would cause a compilation error
    }
}
