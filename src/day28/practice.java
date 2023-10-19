package day28;

import java.util.*;

public class practice {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfer 1 isim giriniz");
        String isim1 = scanner.nextLine();
        System.out.println("Lutfer 1 isim giriniz");
        String isim2 = scanner.nextLine();
        System.out.println("Lutfer 1 isim giriniz");
        String isim3 = scanner.nextLine();
        System.out.println("Lutfer 1 isim giriniz");
        String isim4 = scanner.nextLine();
        System.out.println("Lutfer 1 isim giriniz");
        String isim5 = scanner.nextLine();
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList(isim1,isim2,isim3,isim4,isim5));
        System.out.println(isimler);*/

       // orrrr

     /*   Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println("lutfen isim giriniz");
           isimler.add(scanner.nextLine());
        }
        System.out.println(isimler);*/


        // Task

      /*  ArrayList<Integer> sayilar = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            int rastgelesayi = random.nextInt(100)+1;
            sayilar.add(rastgelesayi);

        }

        System.out.println(sayilar);*/

        // Task

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfet bir cumele giriniz");
        String cumele = scanner.nextLine();
       String[] kelimeler =  cumele.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        ArrayList<String> mylist = new ArrayList<>();
        Collections.addAll(mylist,kelimeler);
        System.out.println(mylist);
        Collections.reverse(mylist);
        System.out.println(mylist);

        for (String kelime:mylist) {
            System.out.print(kelime+" ");
        }*/

        //Task

        Scanner scanner = new Scanner(System.in);
        ArrayList<String > isimlistesi = new ArrayList<>();

        while (true){
            System.out.println("Lutfen isim giriniz");
            String isim = scanner.nextLine();


            if (isim.equalsIgnoreCase("y")){
                break;
            }
            isimlistesi.add(isim);
        }

        System.out.println(isimlistesi);
        Collections.sort(isimlistesi);
        System.out.println(isimlistesi);




    }

}
