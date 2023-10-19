package day18;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class charAt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String girilenkelime = scanner.nextLine();


        for (int i = girilenkelime.length()-1; i >=0 ; i--) {

            char karakter = girilenkelime.charAt(i);
            System.out.print(karakter);

        }


    }
}
