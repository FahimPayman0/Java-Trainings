package day39.mypratik;

import java.util.*;

public class Basic {

    /*public static int numberOfStudent(List<String>studentList){

        int numberofStudent = studentList.size();
        return numberofStudent;
    }*/

    public static int sumOfId (Set<Integer>idList){
        int sumofid = 0;
        for (Integer id:idList) {
            sumofid += id;
        }
        return sumofid;

    }

}
