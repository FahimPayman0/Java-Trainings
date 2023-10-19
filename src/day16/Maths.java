package day16;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a digit");
        int sayi = scanner.nextInt();
        System.out.println("sayi =" + sayi );

        double karakok = Math.sqrt(sayi);
        System.out.println("karakok= " + karakok);
    }
}
