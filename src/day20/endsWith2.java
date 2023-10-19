package day20;

import java.util.Scanner;

public class endsWith2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfer birinci ogrenci ismi giriniz");
        String birinciogrenciIsmi = scanner.nextLine();

        System.out.println("Lutfer ikinci ogrenci ismi giriniz");
        String ikinciogrenciIsmi = scanner.nextLine();

        System.out.println("Lutfer ucuncu ogrenci ismi giriniz");
        String ucuncuogrenciIsmi = scanner.nextLine();

        System.out.println(birinciogrenciIsmi+ikinciogrenciIsmi+ucuncuogrenciIsmi);

        if (birinciogrenciIsmi.endsWith("t")){
            System.out.println(birinciogrenciIsmi+"nny");
        }else {
            System.out.println(birinciogrenciIsmi);
        }
        if (ikinciogrenciIsmi.endsWith("t")){
            System.out.println(ikinciogrenciIsmi+"nny");
        }else {
            System.out.println(ikinciogrenciIsmi);
        }
        if (ucuncuogrenciIsmi.endsWith("t")){
            System.out.println(ucuncuogrenciIsmi+"nny");
        }else {
            System.out.println(ucuncuogrenciIsmi);
        }



    }
}
