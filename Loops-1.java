import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hedef Sayıyı Girin");
        int sayi = input.nextInt();

        for(int i=0;i<sayi;i++)
        {
            if(i%3==0 && i%4==0)
                System.out.println(i+" Sayısı 3 ve 4 e tam bölünüyor.");
        }

    }
}
