package IncrementalAssignments.incremental7;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

public class IncrementalAssignment7 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //to retrieve the path of the file while creating file
        URL url= IncrementalAssignment7.class.getResource(args[0]);
        File file = new File(url.getPath());
        //to read from the file
        FileReader fileReader = new FileReader(file);
        int i;
        //Hashmap for storing frequency values
        HashMap<Character,Integer> hashMap=new HashMap<>();
        //to iterate through each character and compute its frequency
        while ((i=fileReader.read()) != -1)
        {
            char ch=(char)i;
            if(!hashMap.containsKey(ch))
                hashMap.put(ch,1);
            else
                hashMap.put(ch, hashMap.get(ch)+1);
        }
        Iterator iterator=hashMap.entrySet().iterator();
        //to write to output file output.txt in current working directory
        FileWriter fileWriter = new FileWriter(new File("output.txt"));
        PrintWriter printWriter = new PrintWriter(fileWriter);
        while(iterator.hasNext())
        {
            //iterate through hashmap and get frequencies of each char
            HashMap.Entry pair=(HashMap.Entry)iterator.next();
            System.out.println("Character "+pair.getKey()+" is repeated "+pair.getValue()+" times\n");
            //to write to the output file in the current working directory
            if(pair.getKey().toString().equals("\n"))
                printWriter.printf("Character \\n is repeated %d times\n",pair.getValue());
            else
                printWriter.printf("Character %c is repeated %d times\n", pair.getKey(), pair.getValue());
        }


        printWriter.close();
    }
}
