package IncrementalAssignments.incremental4;
import java.util.*;
import java.lang.Integer;
class NegativeSideException extends Exception{
    //exception for negative inputs
    public NegativeSideException(String error)
    {
        super(error);
    }
}
class ValueMismatchException extends Exception{
    //exception for conflicts of length and width values
    public ValueMismatchException(String error)
    {
        super(error);
    }
}
class NullParameterException extends Exception{
    //exception for no parameters
    public NullParameterException(String error)
    {
        super(error);
    }
}
public class IncrementalAssignment4 {
    void returnArea(String l,String w)
    {
        try
        {
            int length,width;
            if(l.equals("")||w.equals(""))
                throw new NullParameterException("Please provide proper input(s).");
            length=Integer.parseInt(l);
            width=Integer.parseInt(w);
            if(length<0||width<0)
                throw new NegativeSideException("Length/width is found to be negative");
            if(length<width)
                throw new ValueMismatchException("Length is found to be smaller than width");
            System.out.println(length*width);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Method terminated");
        }
    }

    public static void main(String[] args)
    {
        IncrementalAssignment4 ia=new IncrementalAssignment4();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length:");
        String length=scanner.nextLine();
        System.out.print("Enter width:");
        String width=scanner.nextLine();
        ia.returnArea(length,width);
    }

}
