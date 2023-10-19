package day19;

import java.util.Scanner;

public class equals3 {
    public static void main(String[] args) {
        String password = "asdf";
        Scanner scanner = new Scanner(System.in);

        String kelime;


        do {
            System.out.println("lutfen dogru password giriniz");
            kelime = scanner.nextLine();
            if (kelime.equals(password)) {
                System.out.println("basarili giris");
            }
        } while (!kelime.equals(password));


    }
}
