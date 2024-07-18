package Hw2.Final;

public class Final {
    public static void main(String[] args) {

        final String personName="Stuart Broad";

 // Once a value is Finalized then We cannot assign any value for the same variable
// cannot assign a value to final variable personName
// Same for method if we use final Keyword before the method we cannot override that method , that will be final
// Same for the Final Class we cannot Inherit(extend) the Final Class
// That stops all kinds of modifications for Classes , Methods and Variables

        // personName = "Jos Buttler"; "It will Give an Error "



        System.out.println("The name of person is : "+personName);
    }
}
