package day17;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        /*String text = "Hello World";
        System.out.println(text.length());*/

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen bir erkek ismi giriniz");
        String erkekismi = scanner.nextLine();
        System.out.println(" Lutfen bir kiz ismi giriniz");
        String kizismi = scanner.nextLine();
        System.out.println(erkekismi + kizismi);

        int erkekIsmiUzunlugu = erkekismi.length();
        int kizIsmiUzunlugu = kizismi.length();
        int uzunlukFarki = erkekIsmiUzunlugu-kizIsmiUzunlugu;
        System.out.println(erkekIsmiUzunlugu + kizIsmiUzunlugu);

        if (uzunlukFarki<=3 && uzunlukFarki>=-3){
            System.out.println("iyi bir eslesme");
        }else {
            System.out.println("Uyumsuz isimler");
        }



    }
}
