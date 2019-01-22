package IncrementalAssignments.incremental2;

import java.util.Scanner;

class MultipleConstructorClass
{
    //default constructor
    public MultipleConstructorClass()
    {
        //takes int input and calls the overloaded constructor
        this((new Scanner(System.in)).nextInt());
    }
    //Overloaded constructor with int argument
    public MultipleConstructorClass(int i)
    {
        System.out.println("Value entered: "+i+" (overloaded constructor)");
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        MultipleConstructorClass multipleConstructorClass=new MultipleConstructorClass();
    }
}
