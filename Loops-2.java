import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,total=0;
        boolean isContinue = true;

        while(isContinue)
        {
            System.out.print("Sayı Girin:");
            number  = input.nextInt();

            if(number%2==1)
                isContinue = false;
            else if(number%4==0)
                total +=number;

        }

        System.out.println("Total = " + total);
    }
}
