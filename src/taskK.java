import java.util.Scanner;

public class taskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        n = n % 1440;

        int hours = n / 60;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}