import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int a0 = in.nextInt();
       int n = in.nextInt();
       int t;

       for(int i = 0; i < n; i++) {
           a0 *= 2;
           if (a0 > 18){
               a0 -= 18;
           }
           System.out.print(a0 + " ");
       }
    }
}
