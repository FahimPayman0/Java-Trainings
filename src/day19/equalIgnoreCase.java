package day19;

import java.util.Scanner;

public class equalIgnoreCase {
    public static void main(String[] args) {
        String rightMail = "masterbranchacademy@gmail.com";
        Scanner scanner = new Scanner(System.in);

        String mailAddress;
        do {
            System.out.println("please enter email address");
          mailAddress  = scanner.nextLine();
          if (mailAddress.equalsIgnoreCase(rightMail)){
              System.out.println("Basarili giris");
          }

        }while (!mailAddress.equalsIgnoreCase(rightMail));








    }
}
