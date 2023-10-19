package day20;

import java.util.Locale;
import java.util.Scanner;

public class replace3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfer bir paragraf giriniz");
        String girilanParagraf = scanner.nextLine();

        String kahramanIsmi = "Harry Potter".toUpperCase();


        String degistrilmisParagraf = girilanParagraf.replace("keloglan",kahramanIsmi);
        System.out.println(degistrilmisParagraf);


    }
}
