package day31;

public class Main {
    public static void main(String[] args) {

     /*   // Creating Custom Constructors

       Pratik pratik1= new Pratik();   // calling non argument constructor like this


        // argument constructors

        Pratik pratik2 = new Pratik("ahmad");
        Pratik pratik3 = new Pratik("Ali");
        Pratik pratik4 = new Pratik("Ali",35);    */


              // Ogrenci class tan
       Ogrenci ogrenci1 = new Ogrenci("ahmad", "vural", 15);

        ogrenci1.nickname();
        System.out.println(ogrenci1.nickname());

        ogrenci1.fullname();
        System.out.println(ogrenci1.fullname());

        System.out.println(ogrenci1.EhliyetYetkinligi());




















    }
}
