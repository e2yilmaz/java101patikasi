import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // DEGISKENLERI OLUSTUR
        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;

        // SCANNER SINIFINI TANIMLA
        Scanner input = new Scanner(System.in);

        // KULLANICIDAN DEGERLERI AL
        System.out.print("Tutar Giriniz : ");
        tutar = input.nextDouble();


        kdvTutari = (kdvOrani * tutar);
        kdvliTutar = (kdvTutari + tutar);

        System.out.println("KDV'siz Tutar ;" + tutar);
        System.out.println("KDV Orani ;" + kdvOrani);
        System.out.println("KDV Tutari ;" + kdvTutari);
        System.out.println("KDV'li Tutar ;" + kdvliTutar);

    }
}