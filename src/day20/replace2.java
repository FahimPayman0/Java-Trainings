package day20;

import java.util.Scanner;

public class replace2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfer isiminsizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyadi giriniz");
        String soyadi = scanner.nextLine();

        System.out.println("Lutfen degistirilmis soyadi giriniz");
        String degistirmisSoyadi = scanner.nextLine();

        String sonHali = soyadi.replace(soyadi,degistirmisSoyadi);

        System.out.println(sonHali);

    }
}
