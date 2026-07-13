import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double enAzVaxt = 0;
        int enSuretliQacisci = 0;

        for (int qacisci = 1; qacisci <= 3; qacisci++) {

            System.out.print(qacisci + "-ci qaçışçının vaxtı: ");
            double vaxt = sc.nextDouble();

            if (qacisci == 1) {
                enAzVaxt = vaxt;
                enSuretliQacisci = qacisci;
            } else if (vaxt < enAzVaxt) {
                enAzVaxt = vaxt;
                enSuretliQacisci = qacisci; }
        }

        System.out.println("Ən sürətli qaçışçı: "
                + enSuretliQacisci + "-ci qaçışçı");
        System.out.println("Vaxtı: " + enAzVaxt + " saniyə");

        sc.close();
    }
}