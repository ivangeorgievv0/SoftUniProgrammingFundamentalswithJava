import java.util.Scanner;

public class Ages01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inNum = Integer.parseInt(sc.nextLine());

        if (inNum <= 2){
            System.out.print("baby");
        } else if (inNum <= 13) {
            System.out.print("child");
        } else if (inNum <= 19) {
            System.out.print("teenager");
        } else if (inNum <= 65) {
            System.out.print("adult");
        }else {
            System.out.print("elder");
        }
    }
}

