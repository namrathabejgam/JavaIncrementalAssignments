package IncrementalAssignments.incremental6;

import java.util.Scanner;

class SListNode<T>
{
    T data;
    SListNode<T> next;
    public SListNode(T data)
    {
        this.data=data;
        this.next=null;
    }
    public String toString()
    {
        if(data==null)
            return "null";
        else
            return data.toString();
    }
}
class SList<T>
{
    SListNode<T> head=new SListNode(null);
    SListIterator<T> iterator()
    {
        return new SListIterator<T>(head);
    }
    public String toString()
    {
        if(head.next==null)
            return "Empty List";

        SListIterator<T> sListIterator=iterator();
        String linkedListString="";
        while(sListIterator.hasNext())
            linkedListString=linkedListString+sListIterator.next()+"-->";

        return linkedListString+"NULL";
    }
}
class SListIterator<T>
{
    SListNode<T> head;
    SListNode<T> currentNode;
    public SListIterator(SListNode<T> head)
    {
        this.head=head;
        this.currentNode=head;
    }
    public boolean hasNext()
    {
        if(currentNode.next==null)
            return false;
        else
            return true;
    }
    public SListNode<T> next()
    {
        currentNode=currentNode.next;
        return currentNode;
    }
    public void insert(T data)
    {
        currentNode.next=new SListNode<T>(data);
        currentNode=currentNode.next;
    }
    public void remove()
    {
        SListNode<T> temp=head;
        if(temp.next==null)
        {
            System.out.println("Empty List");
            return;
        }
        while(temp.next.next!=null)
            temp=temp.next;

        currentNode=temp;
        System.out.println("Removing: " + temp.next.data);
        temp.next=null;
    }
}
public class LinkedListImplementation {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        SList<Integer> sList=new SList<Integer>();
        SListIterator<Integer> iterator=sList.iterator();
        /*System.out.println(sList);
        iterator.insert(10);
        iterator.insert(20);
        System.out.println(sList);
        iterator.insert(30);
        iterator.insert(40);
        System.out.println(sList);
        iterator.remove();
        System.out.println(sList);*/
        while(true)
        {
            System.out.println("1.insert 2.remove 3.display");
            System.out.print("Select any of the above list operations:");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter a number to be inserted:");
                    int data = scanner.nextInt();
                    iterator.insert(data);
                    break;
                case 2:
                    iterator.remove();
                    break;
                case 3:
                    System.out.println(sList);
                    break;
                default:
                    System.out.println("Please enter a valid input(1-3)");
            }
            System.out.print("Do you want to continue(yes/no)?");
            String response=scanner.next();
            if(response.equalsIgnoreCase("no"))
                break;
        }
    }
}
