import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}