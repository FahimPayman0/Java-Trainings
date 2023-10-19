package day39.pratik;


import java.util.*;

public class Map_Set {
    public static void main(String[] args) {
        List<String>nameList = new ArrayList<>();
        nameList.add("Ali");
        nameList.add("Ayse");
        nameList.add("Turan");

        Set<Integer>numbersSet = new HashSet<>();
        numbersSet.add(5);
        numbersSet.add(7);
        numbersSet.add(2);

        Map<List<String>,Set<Integer>> combinedMap = new HashMap<>();
        combinedMap.put(nameList,numbersSet);
        System.out.println("combinedMap = " + combinedMap);


    }
}
