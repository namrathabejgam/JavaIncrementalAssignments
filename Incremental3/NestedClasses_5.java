package IncrementalAssignments.Incremental3;


class OuterClass{
    public class InnerClass{
        public InnerClass(String arg)
        {
            System.out.println(arg);
        }
    }
}
class OuterClass2 extends OuterClass
{

    class InnerClass2 extends OuterClass.InnerClass{
        public InnerClass2()
        {
            super("Constructor of second inner class has been invoked");
        }
    }
}
public class NestedClasses_5 {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass("Constructor of first inner class has been invoked");
        OuterClass2 outerClass2=new OuterClass2();
        OuterClass2.InnerClass2 innerClass2=outerClass2.new InnerClass2();
    }
}
