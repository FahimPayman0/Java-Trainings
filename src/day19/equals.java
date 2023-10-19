package day19;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first text");
        String text1 = scanner.nextLine();
        System.out.println("Please enter the second text");
        String text2 = scanner.nextLine();


        boolean difference = text1.equals(text2);

        if (difference){
            System.out.println("both are same");
        }else {
            System.out.println("both are difference");
        }
    }
}
