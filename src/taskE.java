import java.util.Scanner;

public class taskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long v = scanner.nextLong();
        long t = scanner.nextLong();
        long result = ((v * t) % 109 + 109) % 109;
        System.out.println(result);
    }
}