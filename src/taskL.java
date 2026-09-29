import java.util.Scanner;

public class taskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        n = n % 86400; // количество секунд в сутках

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}