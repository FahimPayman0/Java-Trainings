package day22;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int [] sayilar = { 12,15,5, 7, 15, 11, 32,80, 20,22};
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bit sayi giriniz");
        int girilensayi = scanner.nextInt();

        boolean flag = false;
        for (int sayi : sayilar) {
            if (sayi == girilensayi) {
                flag=true;

            } else {
                flag=false;
            }

        }
        if (flag){
            System.out.println("geciyor");
        }else {
            System.out.println("gecmiyor");
        }

    }
}
