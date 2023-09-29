import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inPower = Integer.parseInt(scanner.nextLine());
        int startPower = inPower;
        int inDistance = Integer.parseInt(scanner.nextLine());
        int inFactor = Integer.parseInt(scanner.nextLine());
        int countPoked = 0;

        while (inPower >= inDistance){
            inPower -= inDistance;
            countPoked++;

        if (inPower == startPower / 2){

            if (inFactor != 0){
                inPower /= inFactor;
            }


        }


        }

        System.out.println(inPower);
        System.out.println(countPoked);


    }
}
