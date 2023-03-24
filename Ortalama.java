import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin : ");
        matematik = input.nextInt();


        System.out.print("Fizik Notunuzu Girin : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Girin : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Girin : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Girin : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Girin : ");
        muzik = input.nextInt();


        float ortalama = (matematik + fizik + kimya + turkce + tarih  + muzik) / 6f;
        System.out.println("Ortalamanız :" + ortalama);
    }
}
