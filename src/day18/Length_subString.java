package day18;

import java.util.Scanner;

public class Length_subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();
        System.out.println(uzunluk);
        String substring = kelime.substring(uzunluk/2);
        System.out.println(substring);
    }
}
