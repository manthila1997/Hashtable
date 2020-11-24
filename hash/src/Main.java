import java.util.Scanner;

public class Main {


    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        hash c = new hash();
        String a = s.next();
       int x =  c.calHash(a);
       c.hashTable(x);




        System.out.println(x);



    }
}
