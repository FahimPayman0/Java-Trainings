package day23;

public class array2 {
    public static void main(String[] args) {
        String [] arr = {"Ahmet", "Mehmet", "Ayse"};
        System.out.println( toplamListeUzunligu(arr));

    }
    public static int toplamListeUzunligu(String[]arr){
        int toplam = 0;
        for (String herbireleman:arr) {
           toplam = toplam + herbireleman.length();

        }
        return toplam;
    }

}
