package namratha.assignment.singleton;
public class Singleton {
    public String s="hola!!";
    public static Singleton initializeString(Singleton singleton,String s)
    {

        /*this.s=s;
        return this; */
        /* the commented code above throws exception saying "non-static variable this cannot be referenced from a static context" .*/
        /*
        A static method is only associated with a class, it can't access the instance member variable values of its class.
        */
        singleton.s=s;
        return singleton;
    }
    public void printString()
    {
        System.out.println("Value of string variable of singeleton class:"+s);
    }
    public static void main(String[] args) {
        System.out.println("SINGLETON CLASS");
        Singleton assignment1=new Singleton();
        assignment1.printString();
        System.out.println("(without passing of arguments)");
        Singleton singleton=initializeString(assignment1,"Hey!!");
        singleton.printString();
    }
}
