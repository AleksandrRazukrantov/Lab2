import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int P0 = in.nextInt();
        double g = in.nextDouble();
        int m = in.nextInt();
        int Cap = in.nextInt();
        int n = 0;

        if(((int)(P0 * g / 100)) + m < 0){
            System.out.println("Население микрарайона постоянно уменьшается");
        }
        else{
            while (P0 < Cap){
                P0 = P0 + ((int)(P0 * g / 100)) + m;
                n++;
            }
            System.out.println(n);
        }
    }
}
