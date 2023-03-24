import java.util.Scanner;

public class Main {
    int a = 10;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1,n2,result=0;
        int choose;

        System.out.print("Birinci Sayıyı Girin :");
        n1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Girin :");
        n2 = input.nextDouble();


        System.out.print("Yapmak İstediğiniz İşlemi Seçin\n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma\nİşlem Girin:");
        choose = input.nextInt();

        switch(choose)
        {
            case 1 :
                result =  n1+n2;
            break;
            case 2 :
                result =  n1-n2;
            break;
            case 3 :
                result =  n1/n2;
            break;
            case 4 :
                result =  n1*n2;
            break;
        }

        System.out.printf("İşlem Sonucunuz : %.2f",result);
    }
}
