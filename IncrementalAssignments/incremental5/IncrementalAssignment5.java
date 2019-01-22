package IncrementalAssignments.incremental5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IncrementalAssignment5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the input string:");
        String input=scanner.nextLine();
        boolean b = Pattern.matches("^[A-Z].*[.]$", input);
        /* matches method returns if the input follows the regex pattern
        ^[A-Z] indicates any upper case letter from alphabet is allowed at the start of the string
        [.]$ indicates that the expression should end with a period.
        .* indicates anything can be allowed in between */
        if(b)
            System.out.println("The given input begins with a capital letter and ends with a period(.)");
        else
            System.out.println("The given input either doesn't begin with a capital letter,or doesn't end with a period(.)");
    }
}
