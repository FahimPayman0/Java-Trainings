package day17;

import java.util.Scanner;

public class Concat_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your last name");
        String surname = scanner.nextLine();
        System.out.println(name.concat(surname));
        String fullname = name+surname;
        System.out.println(fullname.length());
    }
}
