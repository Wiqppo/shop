import java.util.Scanner;
public class taskA{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = Math.sqrt( a*a + b*b );
        System.out.println(c);
    }
}