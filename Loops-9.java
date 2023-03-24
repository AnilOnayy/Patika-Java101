import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user,pass;
        int balance = 1500,right=3,choose;

        while(right>0)
        {
            System.out.println("Kullanıcı Adınızı Girin :");
            user = input.nextLine();

            System.out.println("Şifre Girin :");
            pass = input.nextLine();

            if(user.equals("anil") && pass.equals("123"))
            {
                System.out.println("Giriş Başarılı! ");

                boolean isContinue = true;

                while(isContinue)
                {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.\n1 - Bakiye Sorgula\n2 - Para Yatır\n3 - Para Çek\n4 - Çık");
                    choose = input.nextInt();
                    switch(choose)
                    {
                        case 1 :
                            System.out.printf("Bakiyeniz : %d\n",balance);
                            break;

                        case 2 :
                            System.out.println("Yatırılıcak Miktar :");
                            int willAdd = input.nextInt();
                            balance+=willAdd;
                            System.out.println("Bakiye Başarıyla Eklendi!");
                        break;
                        case 3 :
                            int willMinus = input.nextInt();

                            if(willMinus > balance)
                                System.out.println("Çekmek istediğiniz bakiye mevcut bakiyenizden fazla!");
                            balance = willMinus <=balance ? balance-willMinus : balance;
                        break;
                        case 4 :
                            System.exit(0);
                        break;
                    }
                }

            }
            else{
                right--;
                System.out.println("Kalan Giriş Hakkınız : "+right);

            }
        }

        if(right==0)
        {
            System.out.println("Giriş Hakkınız Bitti!");
        }

    }
}

