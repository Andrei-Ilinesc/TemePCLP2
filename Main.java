
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner tastatura = new Scanner(System.in);
       System.out.println("Introdu un numar natural:");
       int x = tastatura.nextInt();
       int o=0;
       while( x != 0 )
       {
           int c = x % 10;
           o = o * 10 + c;
           x = x / 10;
       }
       while( o != 0)
       {
           System.out.print(o % 10 + " ");
           o= o / 10;
       }
    }
}