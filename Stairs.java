import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter stars height");
        int stairsHeight = in.nextInt();
        for (int a = 0; a < stairsHeight; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("@");
            }
            System.out.print("\n");
        }
    }
}
