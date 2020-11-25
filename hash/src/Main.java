import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        hash c = new hash();
        String data=null;
        c.hashTable();
        ArrayList<String> arr = new ArrayList<String>();
        try{
            File file = new File("/Users/manthilabandara/Documents/manthila/Hashtable/hash/src/words.txt");
            Scanner myReader = new Scanner(file);
                while(myReader.hasNextLine()){
                    String words = myReader.nextLine();
                    arr.add(words);
                }
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }


           for (String i : arr) {
               c.calHash(i);
               c.addData(i);

           }

           c.print();


    }
}
