import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int mat,fizik,turkce,kimya,muzik;
        double average;

        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        average  = (mat+fizik+turkce+kimya+muzik) / 5;


        if(average >  50)
        {
            System.out.printf("Sınıfı Geçtin ! Ortalama: %.2f",average);
        }
        else{
            System.out.printf("Sınıf Terkarı \uD83D\uDE00 Ortalama: %.2f",average);
        }


    }
}
