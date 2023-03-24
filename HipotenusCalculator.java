import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.print("Uzun Kenarı Girin :");
        a =  input.nextInt();

        System.out.print("Kısa Kenarı Girin :");
        b =  input.nextInt();

        c = Math.pow((Math.pow(a,2) + Math.pow(b,2)),0.5);

        System.out.println("C Kenarı : "+c);





    }
}
