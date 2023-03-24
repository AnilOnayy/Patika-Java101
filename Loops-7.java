import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n,total=0;

        System.out.println("Girilen Sayı:");
        n = input.nextInt();

        for(int i=1;i<=n;i++)
            total = total +  (1.0/i);
        

        System.out.printf("Sonuç : %.2f ",total);
    }
}
