import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik = input.nextInt();
        String oneri = "";

         if(sicaklik < 5)
            oneri = "Kayak";

        else if(sicaklik >= 5 && sicaklik < 15)
            oneri = "Sinema";

        else if(sicaklik >= 15  && sicaklik < 25)
            oneri = "Piknik";

        else if(sicaklik >= 25)
             oneri = "Yüzme";



        System.out.printf("Etkinlik Önerim : %s",oneri);

    }
}
