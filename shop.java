import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double  armutP = 2.14,
                elmaP=3.67,
                domatesP = 1.11,
                muzP=0.95,
                patlicanP=5.00;

        double armutK,elmaK,domatesK,muzK,patlicanK;

        double total = 0;

        System.out.print("Armut Kaç Kilo ?");
        armutK = input.nextDouble();

        System.out.print("Elma Kaç Kilo ?");
        elmaK = input.nextDouble();

        System.out.print("Domates Kaç Kilo ?");
        domatesK = input.nextDouble();

        System.out.print("Muz Kaç Kilo ?");
        muzK = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?");
        patlicanK = input.nextDouble();


        total  = (armutK * armutP)  + (elmaK * elmaP) + (domatesK * domatesP) + (muzK * muzP) +  (patlicanK * patlicanP);
        System.out.printf("Toplam Tutar : %.2f",total);

    }
}
