package day23;

import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        for (String isim:isimlist()) {
            System.out.println(isim);

        }

    }
    public static String[] isimlist(){
        String [] isimler = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bes tane isim giriniz");

        for (int i = 0; i <isimler.length ; i++) {
            isimler [i] = scanner.nextLine();
        }

        return isimler;
    }

}
