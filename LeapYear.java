import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Yıl :");
        year = input.nextInt();

        System.out.println( year + year%4==0 ? " Artık yıldır." : " Artık yıl değildir." );

    }
}
