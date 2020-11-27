import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class hashTable {

        private int position=0;
        int tableSize = 10;
        LinkedList<Integer>[] hash = new LinkedList[tableSize];


        public void calHash(int key) {
            int hash;

            int tot = 0;


            hash =  key/100000;

                this.position = hash;



        }

        public void createhashTable(){
            for (int i=0; i<tableSize ; i++){
                hash[i] = new LinkedList();

            }
        }

        public void addData(int data){
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
        public void findVal(int val){
            int temp = 0;
            System.out.println(hash[1].size());
            for (int i=0; i<=position;i++){
                System.out.println("yat");
                System.out.println(hash[i]);
                for (int y=0; y<hash[i].size();y++){
                    int w = hash[i].get(y);
                     temp = val - w;
                    for (int q=position;q>=0;q--){

                        System.out.println(temp);
//                        if (hash[q].contains(temp)){
//                            System.out.println("yay");
//                            break;
//
//                        }
                    }

                }

            }
        }

}
