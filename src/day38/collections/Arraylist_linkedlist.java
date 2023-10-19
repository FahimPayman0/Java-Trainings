package day38.collections;

import java.util.*;

public class Arraylist_linkedlist {
    public static void main(String[] args) {
        // ArrayList kullanımı
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Ali");
        arrayList.add("Veli");
        arrayList.add("Ayşe");

        // LinkedList kullanımı
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Ali");
        linkedList.add("Veli");
        linkedList.add("Ayşe");

        // Ekleme işlemi sonrası zaman farkını gösterelim
        long arrayListStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Öğrenci" + i);
        }
        long arrayListEndTime = System.nanoTime();

        long linkedListStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("Öğrenci" + i);
        }
        long linkedListEndTime = System.nanoTime();

        long arrayListDuration = arrayListEndTime - arrayListStartTime;
        long linkedListDuration = linkedListEndTime - linkedListStartTime;

        System.out.println("ArrayList Ekleme Süresi: " + arrayListDuration + " nanosaniye");
        System.out.println("LinkedList Ekleme Süresi: " + linkedListDuration + " nanosaniye");
    }
}
