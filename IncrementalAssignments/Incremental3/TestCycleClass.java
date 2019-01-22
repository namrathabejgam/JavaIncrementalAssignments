package IncrementalAssignments.Incremental3;
class Cycle{
    void balance()
    {
        System.out.println("You called Balance method of cycle");
    }
}
class Unicyle extends Cycle{
    void balance()
    {
        System.out.println("You called Balance method of unicycle");
    }
}
class Bicycle extends Cycle{
    void balance()
    {
        System.out.println("You called Balance method of bicycle");
    }
}
class Tricycle extends Cycle{

}
public class TestCycleClass {
    public static void main(String[] args) {
        Unicyle unicyle=new Unicyle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Cycle cycle[]=new Cycle[3];
        cycle[0]=(Cycle)unicyle;
        cycle[1]=(Cycle)bicycle;
        cycle[2]=(Cycle)tricycle;
        System.out.println("(UPCASTING)");
        for(int i=0;i<3;i++)
            cycle[i].balance();
        Cycle cycle1[]=new Cycle[3];
        cycle1[0]=new Unicyle();
        cycle1[1]=new Bicycle();
        cycle1[2]=new Tricycle();
        Unicyle unicyle1=(Unicyle)cycle1[0];
        Bicycle bicycle1=(Bicycle)cycle1[1];
        Tricycle tricycle1=(Tricycle)cycle1[2];
        System.out.println("(DOWNCASTING)");
        unicyle1.balance();
        bicycle1.balance();
        tricycle1.balance();
        
    }
}
