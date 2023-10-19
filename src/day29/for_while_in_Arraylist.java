package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class for_while_in_Arraylist {
    public static void main(String[] args) {


        // using for iteration/each loop and while loop in Array

       /* ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (Integer sayiler:numbers) {
            System.out.println(sayiler);

        }*/

      /*  Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers =new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("lutfen sayi giriniz");
            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }*/


        // Task

        /*Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int toplam = 0;
                int index = 0;
        while (true){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scanner.nextInt();

            if (sayi==0) {
                break;
            }
            toplam += sayi;
            numbers.add(sayi);
        }
        System.out.println(numbers);
        System.out.println(toplam);*/


        // Task

       /* Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println("Lutfen bir isim giriniz");
            String isim = scanner.nextLine();
            isimler.add(isim);


        }
        //System.out.print(isimler);

          String yeniIsim = "";
        for (String arkadasismi:isimler) {
           // System.out.println(arkadasismi);
            yeniIsim+= arkadasismi.charAt(0);
        }
        System.out.println(yeniIsim);*/


        //Task

       /* Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int index = 0;
        while (true){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scanner.nextInt();

            if (sayi==0) {
                break;
            }

            if (sayi%2==0){

                numbers.add(sayi);
            }
        }
        System.out.println(numbers);*/






























    }
}
