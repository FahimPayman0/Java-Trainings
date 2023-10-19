package day17;

import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        String rightpasswork = "Gizli123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the password");
        String  password = scanner.nextLine();
        System.out.println(password);
        if (rightpasswork.toLowerCase().equals(password.toLowerCase())) {
            System.out.println("giris basarili");

        }else {
            System.out.println("giris basarisiz");

        }
    }
}
