package day16;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the type of license");
        String licensetype = scanner.nextLine();
        switch (licensetype) {
            case "A":
                System.out.println("Motorsiklet kullanabilirsiniz");
                break;
            case "B":
                System.out.println("Otomobil, otobus kullanabilirsiniz");
                break;
            case "C":
                System.out.println("Kamyon, otobus kullanabilirsiniz");
                break;
            default:
                System.out.println("invalid character");
        }


    }
}
