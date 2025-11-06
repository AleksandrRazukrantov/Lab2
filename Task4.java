import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int n = in.nextInt();
       int a;
       boolean f = false;
       int[] b = new int[101];

       for(int i = 0; i < n; i++){
           a = in.nextInt();
           b[a]++;
       }
       for(int i = 10; i < 101; i++){
           if (b[i] == i){
               System.out.print(b[i] + " ");
               f = true;
           }
       }

       if (f == false){
           System.out.println("NO");
       }

    }
}
