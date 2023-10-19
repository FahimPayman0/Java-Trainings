package day39.pratik;

import java.util.*;

public class Map_Set_List {
    public static void main(String[] args) {
        Map<String, Integer>studentMap = new HashMap<>();
        studentMap.put("Alice", 101);
        studentMap.put("Bob", 102);
        studentMap.put("Charlie", 103);
        List<String>studentNamesList = new ArrayList<>(studentMap.keySet());
        Set<Integer>studentIdList = new HashSet<>(studentMap.values());  // we can use List here as well
        System.out.println("studentNamesList = " + studentNamesList);
        System.out.println("studentIdList = " + studentIdList);
    }
}
