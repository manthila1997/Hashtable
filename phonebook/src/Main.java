public class Main {
    public static  void main(String[] args){

        hashTable pbook = new hashTable();
        pbook.hashTable();
        pbook.calHash("manthila", 997787);
        pbook.calHash("namal", 997788);
        pbook.calHash("kasun", 997784);
        pbook.calHash("manthila", 9977);
//        pbook.calHash("manthila", 997788);
//        pbook.calHash("manthila", 997788);




        pbook.calHash("namal", 9975);
        pbook.calHash("mahinda", 996);

        pbook.print();
        pbook.find(9977);
    }
}
