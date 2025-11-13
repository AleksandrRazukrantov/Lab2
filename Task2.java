import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int N = in.nextInt();
        int s = 0;
        for(int i = 0; i < N; i++){
            s = s*3 + 1;
        }
        System.out.println(s);
    }
}
