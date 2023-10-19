package day39;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* List<String> isimler = new ArrayList<>();
        isimler.add("ahmet");
        isimler.add("Ayse");
        isimler.add("John");

       int ogrenciSayisi = Basic.numberOfStudent(isimler);
        System.out.println(ogrenciSayisi);*/


        Scanner scanner =new Scanner(System.in);
        Set<Integer>idList = new HashSet<>();
        for (int i = 0; i <3 ; i++) {
            System.out.println("Lutfen ogrenci ID giriniz");
            int id = scanner.nextInt();
            idList.add(id);
        }

        Basic.sumOfId(idList);
        int toplam = Basic.sumOfId(idList);
        System.out.println(toplam);






    }

}
