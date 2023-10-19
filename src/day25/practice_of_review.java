package day25;

import java.util.Scanner;

public class practice_of_review {
    public static void main(String[] args) {

        // Task1

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        utilitiesMethods utilitiesMethods = new utilitiesMethods();
       boolean bosmu = utilitiesMethods.bosmu(metin);
        System.out.println(bosmu);
       if (bosmu){
           System.out.println("Metin bos");

       }else {
           if (metin.contains("Hello")){
               metin = metin.concat("World!");
               System.out.println(metin);
           }else {
               System.out.println("Metin Hello kelimesi icermiyor");
           }
       }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = scanner.nextLine();

        if (str.startsWith("a") && str.endsWith("a")&& str.contains("b")){
            System.out.println("True");
        }

        boolean allareA = true;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.toLowerCase(ch)!='a'){
                allareA = false;
                break;
            }

        }
        System.out.println("true");


        if (str.startsWith("a")&& str.endsWith("b")){
            System.out.println("false");
        }
        if (str.startsWith("b")&& str.endsWith("a")){
            System.out.println("false");
        }





    }
}
