package day16;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter squar side parameter");
        double alan = scanner.nextDouble();
        System.out.println("Alan = " +alan*alan);
        System.out.println("Please enter side parameter3");
        double cevre = scanner.nextDouble();
        System.out.println("Cevre= "+ cevre*4);
    }
}
