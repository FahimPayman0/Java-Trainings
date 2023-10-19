package day31;

public class Pratik {

    int sayi;
    String isim;
    String soyisim;


    public Pratik(){

        System.out.println("Hey ben constractor");
    }

    // argument constructors

    public Pratik(String isim){
        System.out.println("*********");
        System.out.println("*********"+isim+"******");
        System.out.println("*********");
    }

    public Pratik(String isim, int yas) {
        System.out.println("*********");
        System.out.println("*********" + isim + "******" + yas);
        System.out.println("*********");
    }
}
