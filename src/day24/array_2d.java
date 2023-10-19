package day24;

public class array_2d {
    public static void main(String[] args) {

        // MultiDimentional Array   // row and column   // [row]  [column]

       /* int [][] multidimention = {
                {12,13,14},
                {22,33,44},
                {15,14,13}
        };

        System.out.println(multidimention[0][2]);*/

        // Task

        int [][] rakamlar = {{36,9,87},{26,54,5},{3,11,62}};



        // Task2

        int [][] notOrtalamasi = {
                {99,42,74,83,100},
                {90,91,72,88,95},
                {88,61,74,89,96},
                {61,89,82,98,93},
                {93,73,75,78,99},
                {50,65,92,87,94}
        };
        int toplam =0;
        for (int i = 0; i < notOrtalamasi.length; i++) {
            toplam += notOrtalamasi[i][0];

        }
        int Ortalamasi = toplam/notOrtalamasi.length;
        System.out.println(Ortalamasi);







    }
}
