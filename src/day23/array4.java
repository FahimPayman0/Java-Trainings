package day23;

public class array4 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        toplam(arr1,arr2);
        System.out.println(toplam(arr1,arr2));

    }

    public static int toplam (int [] arr1, int [] arr2){
       int toplam = arr1[0] + arr2[0];
       return toplam;

    }
}
