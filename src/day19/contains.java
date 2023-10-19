package day19;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text");
        String text = scanner.nextLine();

        System.out.println(" Please enter second text");
        String text2 = scanner.nextLine();

        boolean contain = text.contains(text2);
        System.out.println(contain);
    }
}
