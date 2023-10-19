package day19;

import java.util.Scanner;

public class contain2 {
    public static void main(String[] args) {
        String kelime = "Gizli MBA Password";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        if (kelime.contains(cumle)){
            System.out.println("fine");

        }else {
            System.out.println("Sahte Password");
        }
    }
}
