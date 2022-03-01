import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // DEGISKENLERI OLUSTUR
        double Armutf = 2.14,Elmaf = 3.67,Domatesf = 1.11,Muzf = 0.95,Patlicanf = 5.00;
        int Armut,Elma,Domates,Muz,Patlican;

        // SCANNER SINIFINI TANIMLA
        Scanner inp = new Scanner(System.in);

        // KULLANICIDAN DEGERLERI AL
        System.out.print("Armut Kac Kg ? : ");
        Armut = inp.nextInt();
        System.out.print("Elma Kac Kg ? : ");
        Elma = inp.nextInt();
        System.out.print("Domates Kac Kg ? : ");
        Domates = inp.nextInt();
        System.out.print("Muz Kac Kg ? : ");
        Muz = inp.nextInt();
        System.out.print("Patlican Kac Kg ? : ");
        Patlican = inp.nextInt();


        // FORMUL OLUSTUR
        double ttutar = (Armutf * Armut) + (Elmaf * Elma) + (Domatesf * Domates)+ (Muzf * Muz) + (Patlicanf * Patlican);

        // CIKTIYI ISTE
        System.out.println("Toplam Tutar ;" + ttutar);







    }
}