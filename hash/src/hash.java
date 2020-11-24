import java.lang.reflect.Array;
import java.util.LinkedList;

public class hash {
    private int position=0;
    LinkedList[] hash = new LinkedList[9];


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
        this.position = hash;
        return hash;
    }

    public void hashTable(){
        for (int i=0; i<9 ; i++){
            hash[i] = new LinkedList();

        }
    }

    public void addData(String data){
        for (int i=0; i<9 ; i++){
            if(i==position){
                if (hash[position].isEmpty()){
                    hash[i].addFirst(data);

                }else{
                    hash[position].add(data);

                }
            }

        }

    }

    public void print(){
        for (int i=0; i<9 ; i++){

            System.out.println(hash[i]);


        }
    }
}
