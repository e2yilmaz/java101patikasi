import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // DEGISKENLERI OLUSTUR
        int mat, fizik, kimya, turkce, tarih, muzik;

        // SCANNER SINIFINI TANIMLA
        Scanner inp = new Scanner(System.in);

        // KULLANICIDAN DEGERLERI AL
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + kimya + fizik + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        boolean Gecti = sonuc >= 60;
        String cevap = Gecti ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(cevap);

    }
}