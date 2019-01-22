package IncrementalAssignments.Incremental3;
interface Interface1{
    void method1();
    void method2();
}
interface Interface2{
    void method3();
    void method4();
}
interface Interface3{
    void method5();
    void method6();
}
interface Interface4 extends Interface1,Interface2,Interface3{

    void method7();
}
class BaseClass{
    void method(){
        System.out.println("You called method of concrete base class");
    }
}
class DerivedClass extends BaseClass implements Interface4{

    @Override
    public void method1() {
        System.out.println("You called first method of interface1");
    }

    @Override
    public void method2() {
        System.out.println("You called second method of interface1");
    }

    @Override
    public void method3() {
        System.out.println("You called first method of interface2");
    }

    @Override
    public void method4() {
        System.out.println("You called second method of interface2");
    }

    @Override
    public void method5() {
        System.out.println("You called first method of interface3");
    }

    @Override
    public void method6() {
        System.out.println("You called second method of interface3");
    }

    @Override
    public void method7() {
        System.out.println("You called first method of interface4");
    }

    void concreteMethod1(Interface1 interface1)
    {

        interface1.method1();
        interface1.method2();
    }
    void concreteMethod2(Interface2 interface2)
    {
        interface2.method3();
        interface2.method4();
    }
    void concreteMethod3(Interface3 interface3)
    {
        interface3.method5();
        interface3.method6();
    }
    void concreteMethod4(Interface4 interface4)
    {

        interface4.method7();
    }
}
public class MultipleInterfaces_3 {
    public static void main(String[] args) {
        DerivedClass derivedClass=new DerivedClass();
        derivedClass.concreteMethod1(derivedClass);
        derivedClass.concreteMethod2(derivedClass);
        derivedClass.concreteMethod3(derivedClass);
        derivedClass.concreteMethod4(derivedClass);
        derivedClass.method();
    }
}
