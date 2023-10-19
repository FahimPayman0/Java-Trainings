package day16;

import java.util.Scanner;

public class Maths3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the digit");
        double digit  = scanner.nextDouble();
        double round = Math.round(digit);
        double floor = Math.floor(digit);
        System.out.println("round= "+ round);
        System.out.println("floor = "+ floor);

    }
}
