import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight,height,index;

        System.out.print("Kilonuzu Girin :");
        weight = input.nextDouble();

        System.out.print("Boyunuzu Girin  Ör : 1,87 : ");
        height = input.nextDouble();

        index = weight / Math.pow(height,2);

        System.out.printf("Vücut Kitle İndeksiniz  %.2f:",index);

    }
}
