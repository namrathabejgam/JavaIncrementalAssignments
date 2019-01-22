package IncrementalAssignments.Incremental3;

abstract class Rodent {
    public abstract void method1();
    public abstract void method2();
}
class Mouse extends Rodent {
    public Mouse()
    {
        System.out.println("This is the mouse class.");
    }
    public void method1()
    {
        System.out.println("You called method1 of mouse");
    }
    public void method2()
    {
        System.out.println("You called method2 of mouse");
    }
}
class Gerbil extends Rodent {
    public Gerbil()
    {
        System.out.println("This is the Gerbil class");
    }
    public void method1()
    {
        System.out.println("You called method1 of gerbil");
    }
    public void method2()
    {
        System.out.println("You called method2 of gerbil");
    }
}
class Hamster extends Rodent {
    public Hamster()
    {
        System.out.println("This is the hamster class");
    }
    public void method1()
    {
        System.out.println("You called method1 of hamster");
    }
    public void method2()
    {
        System.out.println("You called method2 of hamster");
    }
}
public class InheritanceHierarchy_1
{
    public static void main(String[] args) {
        Rodent rodent[]=new Rodent[3];
        rodent[0]=new Mouse();
        rodent[1]=new Gerbil();
        rodent[2]=new Hamster();
        rodent[0].method1();
        rodent[0].method2();
        rodent[1].method1();
        rodent[1].method2();
        rodent[2].method1();
        rodent[2].method2();

    }
}