import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

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
//      c.print();
        System.out.println("Enter values of the companies");
        String val = s.nextLine();
        int ans=0;

        String[] str = val.trim().split("\\s+");
        int[] avail = new  int[str.length] ;
        for (int i=0;i<str.length;i++){
            int w = Integer.parseInt(str[i]);


            c.sort();
           ans =  c.findVal(w);
           avail[i] = ans;
        }

        System.out.println(Arrays.toString(avail).replace(",","").replace("[","").replace("]","").trim());

    }
}
