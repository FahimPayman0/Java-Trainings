package day19;

import java.util.Scanner;

public class equals2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci kelime giriniz");
        String kelime = scanner.nextLine();
        System.out.println("Lutfen ikinci kelime giriniz");
        String kelime2 = scanner.nextLine();
        boolean compare = kelime.equals(kelime2);
         String sonuc = (compare)? "isittir": "isit degildir";
        System.out.println(sonuc);
    }
}
