import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class hashTable {


        int tableSize = 10;
        LinkedList<Integer>[] hash = new LinkedList[tableSize];


        public int calHash(int key) {
            int hash;
            hash =  key/100000;



        return hash;
        }

        public void createhashTable(){
            for (int i=0; i<tableSize ; i++){
                hash[i] = new LinkedList();

            }
        }

        public void addData(int data){
            int position=calHash(data);
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
        public void sort(){
            for (int i=0; i<tableSize ; i++){

                Collections.sort(hash[i]);


            }
        }
        public int findVal(int val){
            int position=calHash(val);
            int x=0;
            int temp = 0;
            int c=0;

            for (int i=0; i<=position;i++){
                for (int y=0; y<hash[i].size();y++){
                    int w = hash[i].get(y);
                     temp = val - w;

                     if (temp <= 0) {
                         c=0;
                         continue;
                     }else{
                         x = calHash(temp);

                         if (hash[x].contains(temp)){

                             c=1;
                             break;
                         }
                         else {
                             c=0;

                         }
                     }
                     
                }

            }
            System.out.println(temp);
            return c;

        }

}
