import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel ="";

        for (int i = 1; i <= n ; i++) {
            String inModel = scanner.nextLine();
            double inRadius = Double.parseDouble(scanner.nextLine());
            int inHeight = Integer.parseInt(scanner.nextLine());

            Double volume = Math.PI * Math.pow(inRadius, 2) * inHeight;

            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = inModel;
            }


        }

        System.out.print(maxModel);
    }
}
