package day38.list_set_map;

import java.util.HashSet;
import java.util.Set;

public class Set_praktik {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();   // Hashset is printing as sort of ascending of decending, not as written
        mySet.add("Merhaba");
        mySet.add("Dunya");
        mySet.add("Java");
        mySet.add("Programlama");
        mySet.add("Java");            // ignoring the duplecate elements

       // System.out.println(mySet);    //or  using for each loop or for iteration loop

        for (String kelime:mySet) {
            System.out.println(kelime);
        }
        mySet.remove("Java");
        System.out.println(mySet);



    }
}
