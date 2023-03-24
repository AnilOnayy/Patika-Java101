import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay,gun;
        String burc;
        System.out.print("Doğduğunuz Ay :");
        ay = input.nextInt();

        System.out.print("Doğduğunuz Gün");
        gun = input.nextInt();

        if(!(ay>=1 && ay<=12))
        {
            System.out.println("Ay Bilgisi Yanlış ! 1 ila 12 arasında olmalıdır.");
        }
        else if(!(gun<=31 && gun>=1))
        {
            System.out.println("Gün Bilgisi Yanlış ! 1 ila 30 arasında olmalıdır.");
        }else{
            if(ay==1)
                burc =  gun <=21 ? "Oğlak" : "Kova";
            else if(ay==2)
                burc =  gun <=19 ? "Kova" : "Balık";
            else if(ay==3)
                burc =  gun <=20 ? "Balık" : "Koç";
            else if(ay==4)
                burc =  gun <=20 ? "Koç" : "Boğa";
            else if(ay==5)
                burc =  gun <=21 ? "Boğa" : "İkizler";
            else if(ay==6)
                burc =  gun <=22 ? "İkizler" : "Yengeç";
            else if(ay==7)
                burc =  gun <=22 ? "Yengeç" : "Aslan";
            else if(ay==8)
                burc =  gun <=22 ? "Aslan" : "Başak";
            else if(ay==9)
                burc =  gun <=22 ? "Başak" : "Terazi";
            else if(ay==10)
                burc =  gun <=22 ? "Terazi" : "Akrep";
            else if(ay==11)
                burc =  gun <=21 ? "Akrep" : "Yay";
            else
                burc =  gun <=21 ? "Yay" : "Oğlak";

            System.out.printf("Doğum Tarihiniz %s/%s Burcunuz : %s",gun,ay,burc);
        }
    }
}
