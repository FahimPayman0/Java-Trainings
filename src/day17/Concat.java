package day17;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String adi = scanner.nextLine();
        System.out.println("Please enter your last name");
        String soyadi = scanner.nextLine();
        System.out.println(adi.concat(soyadi));
     }
}
