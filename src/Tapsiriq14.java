import java.util.Scanner;

public class Tapsiriq14 {
    public static void main(String[] args) {

        // Switch və fall-through ilə ayın hansı rübə aid olduğu göstərilir.

        Scanner eded = new Scanner(System.in);

        System.out.print("Ay nömrəsini daxil edin: ");
        int ay = eded.nextInt();

        switch (ay) {
            case 1:
            case 2:
            case 3:
                System.out.println("I rüb");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("II rüb");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("III rüb");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("IV rüb");
                break;

            default:
                System.out.println("Yanlış ay nömrəsi");
        }
    }
}