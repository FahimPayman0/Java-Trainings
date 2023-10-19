package day27;

import java.util.Scanner;
import java.util.SplittableRandom;

public class practiceWrapper {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfer yasinizi giriniz");
        Integer yas = scanner.nextInt();
        System.out.println("yas ="+ yas);
        Boolean yasDurumu =yas>=18;

        if (yasDurumu){
            System.out.println("18 yasinden buyuksunuz ehliyet alabilirsiniz");
        }else {
            System.out.println("ehliyet almaya henuz uygun yasta degilsiniz");
        }*/



        // Task  ParseInt()

        String shirt = "$20";
        String shorts = "$30";
        String shoes = "$30";

        String toplam = "$80";

                // we need pars method to add the values
                // first need to remove $ from numbers to get the sum of numbers
       String shirtArr = shirt.replace("$", "");
        String shortArr = shorts.replace("$", "");
        String shoesArr = shoes.replace("$", "");
        String toplamArr = toplam.replace("$", "");
        System.out.println(shirtArr+shortArr+shoesArr);  // this is wrong result so we go below
        // we should change the String to Integer with parse
        Integer shirtInt = Integer.parseInt(shirtArr);
        Integer shortInt = Integer.parseInt(shortArr);
        Integer shoestInt = Integer.parseInt(shoesArr);

        Integer toplamInt = Integer.parseInt(toplamArr);

        String ToplamDurumu = (shirtInt+shortInt+shoestInt == toplamInt)? "Esit" : "Esit degil";

        System.out.println(ToplamDurumu);









    }
}
