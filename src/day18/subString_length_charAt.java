package day18;

import java.util.Scanner;

public class subString_length_charAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scanner.nextLine();

        int uzunluk = word.length();
        int index = 0;
        while (index<uzunluk){

            char karakter = word.charAt(index);
            String yenistring = karakter + "nny";
            System.out.println(yenistring);
            index++;

        }

    }
}
