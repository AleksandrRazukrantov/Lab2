import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int n1 = in.nextInt();
       System.out.println(((int)Math.pow(3,n1) - 1)/2);
    }
}
