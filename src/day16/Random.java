package day16;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the digit");
        int number = scanner.nextInt();
        System.out.println(number);
        java.util.Random random = new java.util.Random();
        int digit = random.nextInt(number); // if we put a digit instead if number in prantises then this digit will be the maximum number of random
        System.out.println("digit = "+ digit);


    }
}
