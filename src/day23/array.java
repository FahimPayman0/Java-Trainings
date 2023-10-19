package day23;

public class array {
    public static void main(String[] args) {
    int []arr = {1,3,5,7,9};
    int firstEleman = ilkIntElemaniDondur(arr);
        System.out.println(firstEleman);
    }
    public static int ilkIntElemaniDondur(int []arr){

        int iklEleman = arr[0];
        return iklEleman;

    }
}
