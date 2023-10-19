package day23;

public class array6 {
    public static void main(String[] args) {
        double[] puanlistesi = {80.5, 75.5};
        double ortalamasi = ogrencipuanOrtalamasi(puanlistesi);
        System.out.println(ortalamasi);

    }

    public static double ogrencipuanOrtalamasi(double[] puanlistesi) {
        double toplam = 0;
        for (double puan : puanlistesi) {
            toplam = toplam + puan;
        }
        double ortalama = toplam / puanlistesi.length;
        return ortalama;

    }
}
