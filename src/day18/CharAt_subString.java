package day18;

import java.util.Scanner;

public class CharAt_subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();
        int kelimeUzunluk = kelime.length();
        System.out.println(kelimeUzunluk);

        char ilkKaraktar = kelime.charAt(0);
        System.out.println(ilkKaraktar);

        String birlesmisKelime = kelime.concat("concatenation");
        System.out.println(birlesmisKelime);


        String substring = kelime.substring(1);
        System.out.println(substring);

        String kelimeBuyuk = kelime.toUpperCase();
        System.out.println(kelimeBuyuk);

    }
}
