import java.util.Scanner;

public class taskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = (n - k % n) % n;

        System.out.println(result);
    }
}