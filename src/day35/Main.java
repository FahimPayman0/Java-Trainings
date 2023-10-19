package day35;

public class Main {
    public static void main(String[] args) {
      double sonuc1 =  calculateArea(4,5);
       double sonuc2 = calculateArea(5);
        System.out.println(sonuc1);
        System.out.println(sonuc2);



    }

    public static double calculateArea(int length, int width){
        return  length*width;

    }

    public static double calculateArea(int radius){
        double Area = Math.PI*radius*radius;
        return Area;

    }
}
