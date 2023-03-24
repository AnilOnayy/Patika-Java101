import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Girin");
        int sayi = input.nextInt();

        for(int i=0;i<sayi;i++)
        {
            System.out.println("4'ün "+i+". kuvveti :"+Math.pow(4,i));
            System.out.println("5'in "+i+". kuvveti :"+Math.pow(5,i));
        }
    }
}
