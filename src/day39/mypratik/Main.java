package day39.mypratik;

import java.util.*;

public class Main {
    public static void main(String[] args) {


       /* List<String> studentList = new ArrayList<>();
        studentList.add("Bala");
        studentList.add("Maksud");
        studentList.add("Kalbi");
        studentList.add("Tosun");
        studentList.add("Tosun");

        int isimlerSayisi= Basic.numberOfStudent(studentList);
        System.out.println("list of Names = " + studentList);
        System.out.println("isimler Sayisi = " + isimlerSayisi);*/

        /*Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter Id number");
            int idnumber = scanner.nextInt();
            set.add(idnumber);
        }
        System.out.println(set);*/

        Set<Integer> idList = new HashSet<>();
        idList.add(12);
        idList.add(18);
        idList.add(2);
        idList.add(100); 


       int sumOfId = Basic.sumOfId(idList);
        System.out.println(sumOfId);





    }
}
