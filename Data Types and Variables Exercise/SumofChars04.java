import java.util.Scanner;

public class SumofChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {

                char first = scanner.nextLine().charAt(0);
                sum += (int) first;


        }

        System.out.printf("The sum equals: %d", sum);
    }
}
