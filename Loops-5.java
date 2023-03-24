import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int n1,n2,result=1;

        System.out.print("Üstü alınıcak sayıyı girin:");
        n1 = input.nextInt();

        System.out.print("Üstünü girin:");
        n2 = input.nextInt();

        for(int i=0; i<n2;i++)
            result*=n1;

        System.out.println("Sonuç : "+result);
    }
}
