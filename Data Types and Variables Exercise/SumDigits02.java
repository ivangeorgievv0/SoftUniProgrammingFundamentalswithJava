import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
// Алогоритъм за сумиране на цифрите на числа
            while (number > 0){
                int lastDigit = number % 10;
                sum += lastDigit;

                number /= 10;

            }




        System.out.println(sum);
    }
}
