import java.util.Scanner;

public class taskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int totalMinutes = 9 * 60 + n * 45
                + ((n - 1) / 2) * 15
                + ((n - 1 + 1) / 2) * 5;

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}