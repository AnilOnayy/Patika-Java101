import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1,binler,yuzler,onlar,birler;

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        System.out.println("Girilen Sayı:");
        n1 =  input.nextInt();

        birler = n1%10;
        onlar  = Math.floor(n1%100 / 10);
        yuzler = Math.floor(n1%1000 /100);
        binler = Math.floor(n1%10000 /1000);

        System.out.printf("%.2f - %.2f - %.2f - %.2f",binler,yuzler,onlar,birler);
        System.out.println(birler+onlar+yuzler+binler);
    }
}
