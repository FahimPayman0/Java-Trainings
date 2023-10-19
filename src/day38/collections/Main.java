package day38.collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(54);
        liste.add(66);
        liste.add(8);
        liste.add(110);
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(liste.get(i));

        }
        System.out.println(liste.get(3));
        liste.remove(3);
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(liste.get(i));
        }






    }
}
