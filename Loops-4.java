import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,r1=1,r2=1,r3=1,result;


        System.out.println("Kombinasyonu alınıcak 1. sayıyı girin :");
        n1 = input.nextInt();

        System.out.println("Kombinasyonu alınıcak 2. sayıyı girin :");
        n2 = input.nextInt();


        for(int i=1;i<=n1;i++){ r1*=i; }
        for(int i=1;i<=n2;i++){ r2*=i; }
        for(int i=1;i<=n2-n1;i++){ r3*=i; }

        result = r1 / (r2 * r3);
        System.out.println(result);

    }
}
