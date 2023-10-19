package day17;

import java.util.Scanner;

public class IsEmpty_IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();
        System.out.println(metin + kelime);
        int index = metin.indexOf(kelime);
        if (metin.isEmpty()) {
            System.out.println("metin girisi yapilmadi, lutfen tekrar deneyin");
        }else {
            if (index ==-1){
                System.out.println("kelime metin icerisinde yok");
            }else {
                System.out.println("girilen kelime index" +index);
            }
        }
    }
}

