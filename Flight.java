import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance,age,type;
        double ticket,perDistance = 0.10;

        System.out.print("Mesafe bilgisini girin :");
        distance = input.nextInt();

        ticket = distance * perDistance;

        System.out.print("Yaşınızı Girin :");
        age = input.nextInt();

        System.out.print("Bilet Seçeneğini Seçin\n1-Tek Yön\n2-Gidiş Dönüş    Seçim:");
        type = input.nextInt();

        if(distance < 0)
            System.out.println("Hatalı giriş mesafe 0'dan büyük olmalıdır.");
        else if(age < 0 )
            System.out.println("Hatalı giriş Yaş 0'dan büyük olmalıdır.");
        else{

            if(age<12)
                ticket /=2;
            else if(age >= 12 && age<=24)
                ticket*=.9;
            else if(age > 65)
                ticket*=.7;

            if(type==2)
                ticket*=.8;

            System.out.printf("Toplam Tutar %.2f",ticket);
        }

    }
}
