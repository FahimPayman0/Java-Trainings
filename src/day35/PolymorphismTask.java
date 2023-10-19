package day35;

public class PolymorphismTask {
    public static void main(String[] args) {

  //selam();                              // Polymorphism for method overLoading
  selam(3.5, 5);

    }
    public static void selam(){
        System.out.println("Ben int ");
    }
    public static void selam(int x, int y){
        System.out.println("Ben int ");
    }

    public static void selam(double x, double y){
        System.out.println("Ben double");
    }
}
