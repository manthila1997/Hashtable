import java.util.Scanner;

public class Main {


    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        hash c = new hash();
        char y;
        int x =0;
        String data=null;
        c.hashTable();
        String[] arr = {"mango", "apple", "banana","coffee","manthila","mango"};

       do {
//           String a = s.next();
           for(int i=0;i<arr.length;i++){
             c.calHash(arr[i]);
               c.addData(arr[i]);

           }

           c.print();

           System.out.println("do you want to add another value");
            y = s.next().charAt(0);

       }
       while (y == ('y'));




        System.out.println(x);



    }
}
