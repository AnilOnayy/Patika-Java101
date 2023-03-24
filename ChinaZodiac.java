import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birth;

        System.out.print("Doğum Yılınız :");
        birth = input.nextInt();

        int zodiac = birth%12;
        String text="";

        switch(zodiac)
        {
            case 0 : text = "Maymun"; break;
            case 1 : text = "Horoz"; break;
            case 2 : text = "Köpek"; break;
            case 3 : text = "Domuz"; break;
            case 4 : text = "Fare"; break;
            case 5 : text = "Öküz"; break;
            case 6 : text = "Kaplan"; break;
            case 7 : text = "Tavşan"; break;
            case 8 : text = "Ejderha"; break;
            case 9 : text = "Yılan"; break;
            case 10 : text = "At"; break;
            case 11 : text = "Koyun"; break;
        }

        System.out.printf("Çin zodyağınız :%s",text);
    }
}
