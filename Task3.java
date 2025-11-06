import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int P0 = in.nextInt();
       double g = in.nextDouble();
       int m = in.nextInt();
       int Cap = in.nextInt();
       int k = 0;

       while (P0 < Cap){
           P0 = P0 + ((int)(P0 * g / 100));
           P0 += m;
           k++;
       }
       System.out.println(k);
    }
}
