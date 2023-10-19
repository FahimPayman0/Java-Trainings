package day16;

import java.util.Scanner;

public class Maths2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a digit");
        double sayi = scanner.nextDouble();
        double digit = Math.floor(sayi);
        System.out.println(digit);

    }
}
