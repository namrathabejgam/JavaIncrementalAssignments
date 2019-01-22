package IncrementalAssignments.Incremental3;
interface CycleInterface
{
    void method1();
    void method2();
}
class Unicyle1 implements CycleInterface{

    @Override
    public void method1() {
        System.out.println("You called method1 of unicycle");
    }

    @Override
    public void method2() {
        System.out.println("You called method2 of unicycle");
    }
}
class Bicyle1 implements CycleInterface{

    @Override
    public void method1() {
        System.out.println("You called method1 of bicycle");
    }

    @Override
    public void method2() {
        System.out.println("You called method2 of bicycle");
    }
}
class Tricyle1 implements CycleInterface{

    @Override
    public void method1() {
        System.out.println("You called method1 of tricycle");
    }

    @Override
    public void method2() {
        System.out.println("You called method2 of tricycle");
    }
}
class CycleFactory{
    public CycleInterface getCycle(String cycleType)
    {
        if(cycleType==null)
            return null;
        if(cycleType.equalsIgnoreCase("uni"))
            return new Unicyle1();
        else if(cycleType.equalsIgnoreCase("bi"))
            return new Bicyle1();
        else if(cycleType.equalsIgnoreCase("tri"))
            return new Tricyle1();

        return null;
    }
}
public class TestCycleInterface {
    public static void main(String[] args) {
        CycleFactory cycleFactory=new CycleFactory();
        System.out.println("(CREATION THROUGH FACTORY METHODS)");
        CycleInterface unicycle1=cycleFactory.getCycle("uni");
        unicycle1.method1();
        unicycle1.method2();
        CycleInterface bicycle1=cycleFactory.getCycle("bi");
        bicycle1.method1();
        bicycle1.method2();
        CycleInterface tricycle1=cycleFactory.getCycle("tri");
        tricycle1.method1();
        tricycle1.method2();
    }
}
