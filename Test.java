import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // DEGISKENLERI OLUSTUR
        double perKm = 2.20, total, startPrice = 10;
        int km;

        // SCANNER SINIFINI TANIMLA
        Scanner input = new Scanner(System.in);

        // KULLANICIDAN DEGERLERI AL
        System.out.print("Mesafeyi Giriniz : ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar ;" + total);






    }
}