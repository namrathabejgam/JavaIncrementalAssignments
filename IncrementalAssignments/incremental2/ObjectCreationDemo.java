package IncrementalAssignments.incremental2;

import java.util.Random;
import java.util.Scanner;

class Object1
{
    public Object1(String s,int i)
    {
        System.out.println("String passed to object "+i+" is "+s);
    }
}
public class ObjectCreationDemo {
    public static void main(String[] args) {
        System.out.print("Enter the number of objects to be created:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Object1 objects[]=new Object1[n];
        String s[]={"hello","hi","hey"};
        Random random=new Random();
        for(int i=0;i<n;i++)
        {
            objects[i]=new Object1(s[random.nextInt(s.length)],i);
        }
        System.out.print("(initialization messages are printed)");
    }
}
