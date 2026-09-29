import java.util.Scanner;

public class taskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = a + (b - a) * ((b - a + 1000) / 1000);

        System.out.println(max);
    }
}