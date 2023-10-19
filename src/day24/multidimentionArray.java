package day24;

import java.util.Arrays;

public class multidimentionArray {
    public static void main(String[] args) {


        // Task
        String [][] takimlar = {
                {"TAKIMLAR","Galibiyet","Beraberlik","Maglubiyet","Altin Gol","Yenilen Gol","Averaj","Puan"},
                {"Galatasaray", "18", "3", "5","52", "19", "33","57"},
                {"Besiktas", "16", "3", "6","47","27","20","51"},
                {"Fenerbahce", "16", "3", "6","47","27","20","51"},
                {"Trabzonspor", "16", "3", "6","47","27","20","51"}
        };

        for (int i = 0; i < takimlar.length; i++) {
            if (takimlar[i][0]=="Galatasaray" || takimlar[i][0]=="Fenerbahce") {
                for (String takimBilgileri : takimlar[i]) {
                    System.out.println("takimBilgileri : " + takimBilgileri);
                }
            }
        }




    }
}
