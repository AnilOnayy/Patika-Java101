import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username,pass,newpass="";

        System.out.print("Kullanıcı Adınızı Girin :");
        username = input.nextLine();

        System.out.print("Şifrenizi Girin :");
        pass = input.nextLine();


        if(username.equals("Patika") && pass.equals("java123") )
        {
            System.out.println("Giriş Yaptınız.");
        }
        else if(username.equals("Patika")  && !pass.equals("java123")) // Eşit değilse
        {

            int secim;

            System.out.print("Şifrenizi yenilemek ister misiniz?\n1-Evet\t2-Çık");
            secim = input.nextInt();
            newpass = input.nextLine();

            if(secim==1)
            {
                boolean isOk = true;
                while(isOk)
                {
                    System.out.println("Yeni şifenizi girin : ");
                    newpass = input.nextLine();

                    if (newpass.isEmpty()) {
                        continue;
                    }


                    if(input.hasNextLine())
                    {
                        if(newpass.equals("java123"))
                        {
                            System.out.print("Bu şifre geçersiz lütfen farklı bir şifre girin!");
                        }
                        else{
                            System.out.println("Şifre başarıyla oluşturuldu!");
                            isOk = false;
                        }
                    }

                }
            }
        }
        else {
            System.out.println("Giriş Başarısız!");
        }
    }
}
