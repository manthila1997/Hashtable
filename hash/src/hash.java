import java.lang.reflect.Array;
import java.util.LinkedList;

public class hash {
    private int position=0;
    int tableSize = 97;
    LinkedList[] hash = new LinkedList[tableSize];


    public int calHash(String key){
        int hash=7;

        int tot = 0;
        for (int i =0;i<key.length();i++){

            hash = (int) key.charAt(i)%tableSize;
            tot = tot +hash;


        }
         hash = tot%tableSize;
        this.position = hash;
        return hash;
    }

    public void hashTable(){
        for (int i=0; i<tableSize ; i++){
            hash[i] = new LinkedList();

        }
    }

    public void addData(String data){
        for (int i=0; i<tableSize ; i++){
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
        for (int i=0; i<tableSize ; i++){

            System.out.println(hash[i]);


        }
    }
}
