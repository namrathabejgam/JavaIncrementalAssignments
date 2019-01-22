package namratha.assignment.main;

import namratha.assignment.data.Data;
import namratha.assignment.singleton.Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("DATA CLASS");
        Data data=new Data();
        data.printMembers();
        //Singleton assignment1=Singleton.initializeString("HEY!!");
        System.out.println("SINGLETON CLASS");
        Singleton assignment1=new Singleton();
        System.out.println("(without passing of arguments)");
        assignment1.printString();
        System.out.print("Enter a string:");
        String s=scanner.nextLine();
        Singleton singleton= Singleton.initializeString(assignment1,s);
        singleton.printString();
  }
}
