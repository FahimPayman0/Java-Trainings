package day19;

import java.util.Scanner;

public class contain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please write 4 fundamentals ");
        String kelime = scanner.nextLine();

        boolean inheritanceDurumu = kelime.contains("inheritance");
        boolean polymorphismDurumu = kelime.contains("polymorphism");
        boolean encapsulationDurumu = kelime.contains("encapsulation");
        boolean abstractionDurumu = kelime.contains("abstraction");

        if (inheritanceDurumu && polymorphismDurumu && encapsulationDurumu && abstractionDurumu){
            System.out.println("fine");
        }else {
            System.out.println("oop bilmiyorsunuz");
        }

    }
}
