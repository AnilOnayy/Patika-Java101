import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        String result = "";


        System.out.print("İlk Sayıyı Gir");
        a = input.nextInt();

        System.out.print("İkinci Sayıyı Gir");
        b = input.nextInt();

        System.out.print("Üçüncü Sayıyı Gir");
        c = input.nextInt();


        if(a==b || b==c || a==c)
        {
            System.out.print("Tüm Sayılar Benzersiz Olmalı");

        }
        else{

            if(a > b && a>c)
            {
                if(b>c)
                {
                    result = "a > b > c";
                }
                else{
                    result = " a > c > b";
                }
            }
            else if ( b > a && b > c)
            {
                if(a>c)
                {
                    result = "b > a > c";
                }
                else{
                    result = "b > c > a";
                }
            }
            else{
                if(b > a)
                {
                    result = "c > b > a";
                }
                else{
                    result = "c > a > b";
                }
            }

        }


        System.out.printf("Sonuç  : %s",result);

    }
}
