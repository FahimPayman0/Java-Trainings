package day27;

import java.util.Scanner;
public class toString {
    public static void main(String[] args) {
        // toString() methods
        System.out.println(yas());

    }

    public static String yas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz:");
        Integer dogumYili = scanner.nextInt();
        System.out.println("Lutfen mevcut yili giriniz:");
        Integer mevcutYil = scanner.nextInt();
        Integer yas = mevcutYil - dogumYili;
        String yasString = yas.toString();
        return yasString;

    }
}
