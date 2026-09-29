import java.util.Scanner;

public class taskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int days = (m + n - 1) / n;

        System.out.println(days);
    }
}