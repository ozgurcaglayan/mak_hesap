import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Birinci sayiyi giriniz: ");
        Scanner sayi1 =new Scanner(System.in);
        float s1 = sayi1.nextInt();

        System.out.println("İkinci sayiyi giriniz: ");
        Scanner sayi2 =new Scanner(System.in);
        float s2 = sayi1.nextInt();

        System.out.println("Yapmak istediginiz islemi seciniz : \n1)Toplama \n2)Çıkarma\n3)Çarpma \n4)Bölme");
        Scanner klavye = new Scanner(System.in);
        System.out.println("İşlem Seçiniz: " );
        int islem =klavye.nextInt();

        switch (islem){
            case 1:
                System.out.println("Sonuç s1+s2: " + s1+s2);
                break;

            case 2:
                System.out.println("Sonuç s1-s2:" + (s1-s2));
                break;

            case 3:
                System.out.println("Sonuç s1*s2: " + s1*s2);
                break;

            case 4:
                System.out.println("Sonuç s1/s2: " + s1/s2);
                break;
        }
        return;




    }
}