import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("hello");
        Scanner s = new Scanner(System.in);
        hashTable c = new hashTable();
        String data=null;
        c.createhashTable();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try{
            File file = new File("/Users/manthilabandara/Documents/manthila/Hashtable/q3/src/PriceList.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                int words = myReader.nextInt();
                arr.add(words);
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }


        for (int i : arr) {
            c.calHash(i);
            c.addData(i);

        }
//        c.sort();
//        c.print();
        System.out.println("Enter values of the companies");
        int val = s.nextInt();
        c.calHash(val);
        c.sort();
        c.findVal(val);

    }
}
