package day26;

import java.util.Arrays;
import java.util.Scanner;

public class array_tekrar {
    public static void main(String[] args) {
      /*  String [] dashboard =
                {"Tum", "Gunun Teklifleri", "Musteri Servisi", "Istek Listesi", "Hadiye Kartleri", "Amazon da satis yapin"};

       String sonuc = (dashboard.length ==6) ? "boyut dogru" : "boyut yanlis";
        System.out.println(sonuc);

        for (String title:dashboard) {
            if (title.contains("Istek Listesi")){
                System.out.println("iceriyor");
            }*/

       /* String metin = "\"sapka\" icin  223 sonuctan 1-48 arasi";
        System.out.println(metin);
        String [] kelimeler = metin.split(" ");
        System.out.println(Arrays.toString(kelimeler));*/


        /*String sentence = "Merhaba, nasilsiniz? Ben iyiyim.";

        String [] bolma = sentence.split(" ");
        System.out.println(Arrays.toString(bolma));*/


        /*String metin = "\"sapka\" icin  223 sonuctan 1-48 arasi";
        String [] str = metin.split(" ");
        System.out.println(Arrays.toString(str));

        if (str[str.length-2].equals("1-48")){
            System.out.println("var");
        }else {
            System.out.println("yok");
        }*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();
        System.out.println("girilenMetin:"+girilenMetin);

        System.out.println(ortalamaKarakter(girilenMetin));;
        

    }
    public static double ortalamaKarakter(String girilenMetin) {

        String[] metin = girilenMetin.split(" ");
        double toplamKarakter = 0.0;

        for (String herbirEleman : metin) {
            toplamKarakter = toplamKarakter + herbirEleman.length();
        }
            return toplamKarakter;
    }
}
