import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km;

        float perKm = 2.20f,price;
        int open  = 10;

        System.out.print("Kaç KM Gittin  ? :");
        km = input.nextInt();


        price = (km*perKm) + open;
        price = price < 20 ? 20 : price;


        System.out.println("Total Ödenecek Fiyat :"+price);





    }
}
