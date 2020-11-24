import java.lang.reflect.Array;
import java.util.LinkedList;

public class hash {
    public int calHash(String key){
        int hash=0;
        int tableSize = 9;
        int tot = 0;
        for (int i =0;i<key.length();i++){
            int w=0;
            w = key.charAt(i);
            tot = w + tot;

        }
         hash = tot%tableSize;
        return hash;
    }

    public void hashTable(int x){
        int[] hashKey = new int[9];
        LinkedList[] hash = new LinkedList[9];


        for (int i=0; i<9 ; i++){
            hash[i] = new LinkedList();

        }
        for (int i=0; i<9 ; i++){
            if(i==x){
                hash[i].addFirst("hello");
                hash[i].add("babe");
            }

        }
        for (int i=0; i<9 ; i++){

            System.out.println(hash[i]);


        }

    }
}
