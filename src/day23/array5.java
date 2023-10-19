package day23;

public class array5 {
    public static void main(String[] args) {
        int  arr1 = 1;
        int  arr2 = 3;
        int  arr3 = 5;
        int  arr4 = 7;
        int  arr5 = 9;
        int [] dondurulenarray = arrayOlustur(arr1,arr2,arr3,arr4,arr5);
        for (int ar:dondurulenarray) {
            System.out.println(ar);
        }



    }
         public static int[] arrayOlustur(int arr1, int  arr2, int  arr3, int  arr4, int  arr5){
        int [] liste = {arr1, arr2, arr3, arr4, arr5};
        return liste;

    }
}
