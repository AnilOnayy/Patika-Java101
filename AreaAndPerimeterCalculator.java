import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r;
        double area,perimeter;

        System.out.print("Dairenin Yarı Çapını Girin:");
        r = input.nextInt();

        area =  Math.PI * Math.pow(r,2);
        perimeter = Math.PI * 2  * r;

        System.out.printf("Dairenin Alanı: %.2f \nÇevresi: %.2f",area,perimeter);

    }
}
