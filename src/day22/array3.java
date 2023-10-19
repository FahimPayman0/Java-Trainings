package day22;

public class array3 {
    public static void main(String[] args) {

        int [] sayilar_1 = {1,2,3,4,5,6,7,8,9,10};
        int [] sayilar_2 = {1,2,3,4,5,6,7,8,9,11};
        int index = 0;
        boolean flag = true;
        for (int sayi : sayilar_1) {
            if (sayi != sayilar_2[index]) {
                flag = false;
                break;
            }
            index++;
        }
        if (flag) {
            System.out.println("Esit");
        } else {
            System.out.println("Esit degil");
        }

        }
}
