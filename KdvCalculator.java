import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price;

        Scanner input  = new Scanner(System.in);

        System.out.print("Fiyat Girin :");
        price = input.nextInt();


        float kdv = price > 1000 ? 0.08f : 0.18f;
        System.out.println("KDV Dahil Fiyat :" + (price + (price*kdv) ) );

    }
}
