import java.util.Scanner;

public class EvenOddUser {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = reader.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
