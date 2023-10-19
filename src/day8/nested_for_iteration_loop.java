package day8;

public class nested_for_iteration_loop {
    public static void main(String[] args) {
        for (int i = 0; i <2 ; i++) {
            System.out.println( "outer loop = "+ i);

            for (int j = 0; j <3 ; j++) {
                System.out.println("inner loop = "+ j);
            }

        }

      /*  for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }*/
       /* for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for (int i = 0; i <6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*int row = 4;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <=row-i+1; j++) {
                System.out.print(i);

            }
            System.out.println();

        }*/


        /*for (int i = 10; i >=1 ; i--) {
            System.out.println(i);

        }*/
            /*int toplam = 0;
        for (int i = 1; i <=50 ; i++) {
            toplam +=i;
        }
        System.out.println(toplam);*/

        /*for (int i = 1; i <=5 ; i++) {
            System.out.print(i+".");
            for (int j = 1; j <=4 ; j++) {
                System.out.print(0);

            }
            System.out.println();

        }*/

        /*for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".");
            for (int j = 1; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println();

        }*/

        /*for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".(");
            for (int j = 5; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println(")");

        }*/

       /* for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".(");
            for (int j = 10; j >= 1; j-=2){
                System.out.print(j);
            }
            System.out.println(")");

        }*/

        /*String [] color = {"kirmizi", "mavi", "yasil", "sari", "turuncu"};
        for (String name:color) {
            System.out.println(name);
        }*/

        /*int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int name : numbers) {
            if (name % 2 == 1)
                System.out.println(name);

        }*/



    }
}
