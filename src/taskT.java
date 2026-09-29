
import java.util.Scanner;

public class taskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;
        System.out.println(Math.abs(d1 - d4) + Math.abs(d2 - d3) + 1);
    }
}
