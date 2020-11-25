import java.util.LinkedList;

public class hashTable {


        private int position=0;
        int tableSize = 9;
        LinkedList[] hash = new LinkedList[tableSize];


        public int calHash(String key, int num){
            int hash=7;

            int tot = 0;
            for (int i =0;i<key.length();i++){

                hash = (int) key.charAt(i)%tableSize;
                tot = tot +hash;


            }
            hash = tot%tableSize;
            this.position = hash;
            addData(key, num);
            return hash;
        }

        public void hashTable(){
            for (int i=0; i<tableSize ; i++){
                hash[i] = new LinkedList();

            }
        }

        public void addData(String data, int num){
            for (int i=0; i<tableSize ; i++){
                if(i==position){
                    if (hash[position].isEmpty()){
                        hash[i].addFirst(data);
                        hash[i].add(num);

                        }else{
                        position++;
                          addData(data, num);
                            break;
                        }
                }

            }

        }


        public void print(){
            for (int i=0; i<tableSize ; i++){

                System.out.println(hash[i]);


            }
        }
        public void find(int num){

            for (int i=0; i<tableSize ; i++){
               if (hash[i].contains(num)){
                   System.out.println(hash[i].getFirst());

               }

            }
        }


}
