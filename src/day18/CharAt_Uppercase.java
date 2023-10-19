package day18;

import java.util.Scanner;

public class CharAt_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String");
        String Karakter = scanner.nextLine();

        int ortaindex = Karakter.length()/2;
        char ortadakikarakter = Karakter.charAt(ortaindex);
        System.out.println(ortadakikarakter);
    }
}
