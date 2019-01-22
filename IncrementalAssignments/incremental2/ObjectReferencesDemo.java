package IncrementalAssignments.incremental2;

import java.util.Scanner;

class Object
{
    public Object(String s,int i)
    {
        System.out.println("String passed to object "+i+" is "+s);
    }
}
public class ObjectReferencesDemo {
    public static void main(String[] args) {
        System.out.print("Enter the number of objects to be created:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Object objects[]=new Object[n];
        System.out.print("(initialization messages are not printed)");
    }
}
