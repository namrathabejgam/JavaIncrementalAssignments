package namratha.assignment.data;

public class Data {
    public int i;
    public char c;
    public void printMembers()
    {
        System.out.println("Value of int member variable of data class:"+i);
        System.out.println("Value of char member variable of data class:"+c);
    }
    /*

    ***Variables are not initialized: throws error

    public void printMembers1()
    {
        int i1;
        char c1;
        System.out.println(i1+" "+c1);
    }*/
    public static void main(String[] args)
    {
        System.out.println("DATA CLASS");
        Data data=new Data();
        data.printMembers();
        //assignment.printMembers();
    }
}