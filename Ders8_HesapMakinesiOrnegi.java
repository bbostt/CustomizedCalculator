import java.util.Scanner;

public class Ders8_HesapMakinesiOrnegi {
    public static double toplama_islemi (double s1, double s2) {
        double sonuc;
        sonuc=s1+s2;
        return sonuc;
    }
    public static double cikarma_islemi (double s1, double s2) {
        double sonuc;
        sonuc=s1-s2;
        return sonuc;
    }
    public static double carpma_islemi (double s1, double s2) {
        double sonuc;
        sonuc=s1*s2;
        return sonuc;
    }
    public static double bolme_islemi (double s1, double s2) {
        double sonuc;
        sonuc=s1/s2;
        return sonuc;
    }
    public static double UsHesaplama (double s1, double s2) {
        double sonuc;
        sonuc=1;
        for(int i=1;i<=s2;i++) {
            sonuc*=s1;
        }
        return sonuc;
    }
    public static double FaktoriyelHesaplama (double s1) {
        double sonuc;
        sonuc=1;
        for(int i=1; i<=s1;i++) {
            sonuc*=i;
        }
        return sonuc;
    }
    public static double ModAlma (double s1 ,double s2) {
        double sonuc;
        sonuc = s1%s2;

        return sonuc;
    }
    static void DikdortgenAlanCevre (double s1 ,double s2) {
        double Alan=s1*s2;
        double cevre=2*(s1+s2);
        System.out.println("Dikd�rtgenin Alan�: "+ Alan);
        System.out.println("Dikd�rtgenin �evresi: "+ cevre);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int islem;
        double sayi1,sayi2;
        double sonuc;

        do {
            System.out.print("****************HESAP MAKINESI*****************\n");
            System.out.print("1- Toplama ��lemi\n" +
                    "2- ��karma ��lemi\n" +
                    "3- �arpma ��lemi\n"+
                    "4- B�lme i�lemi\n"+
                    "5- �sl� Say� Hesaplama\n"+
                    "6- Faktoriyel Hesaplama\n"+
                    "7- Mod Alma\n"+
                    "8- Dikd�rtgen Alan ve �evre Hesab�\n"+
                    "0- ��k�� Yap\n");
            System.out.print("*************************************************\n");
            System.out.print("Yapmak istediginiz islemi seciniz: ");
            islem=sc.nextInt();

            switch (islem) {
                case 1:
                    System.out.print("iki adet sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sayi2= sc.nextDouble();
                    sonuc=toplama_islemi(sayi1,sayi2);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"ikinci sayi: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 2:
                    System.out.print("iki adet sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sayi2= sc.nextDouble();
                    sonuc=cikarma_islemi(sayi1,sayi2);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"ikinci sayi: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 3:
                    System.out.print("iki adet sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sayi2= sc.nextDouble();
                    sonuc=carpma_islemi(sayi1,sayi2);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"ikinci sayi: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 4:
                    System.out.print("iki adet sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sayi2= sc.nextDouble();
                    sonuc=bolme_islemi(sayi1,sayi2);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"ikinci sayi: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 5:
                    System.out.print("Tabani giriniz: ");
                    sayi1= sc.nextDouble();
                    System.out.print("�ss� giriniz: ");
                    sayi2= sc.nextDouble();
                    sonuc=UsHesaplama(sayi1,sayi2);
                    System.out.print("Taban: " +sayi1 +"\n" +"�s: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 6:
                    System.out.print("sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sonuc=FaktoriyelHesaplama(sayi1);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"Sonu�: " +sonuc +"\n");
                    break;

                case 7:
                    System.out.print("iki adet sayi giriniz: ");
                    sayi1= sc.nextDouble();
                    sayi2= sc.nextDouble();
                    sonuc=ModAlma(sayi1,sayi2);
                    System.out.print("ilk sayi: " +sayi1 +"\n" +"ikinci sayi: " +sayi2 +"\n"+"Sonu�: " +sonuc +"\n");
                    break;

                case 8:
                        System.out.print("Uzun Kenar� Giriniz: ");
                        sayi1= sc.nextDouble();
                        System.out.print("K�sa Kenar� Giriniz: ");
                        sayi2= sc.nextDouble();
                        DikdortgenAlanCevre(sayi1,sayi2);
                        break;

                        default:
                         System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz." +"\n");
                         break;
            }
        }
        while (islem != 0);
        System.out.println("��k�� Yap�lm��t�r..");
    }
}