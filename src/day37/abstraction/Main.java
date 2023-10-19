package day37.abstraction;

public class Main {
    public static void main(String[] args) {

       // Ulker ulker = new Ulker();    // as the Ulker class is abstract so we can not bring itis object to main class so be use other classes as below
      //  ulker.sirketGezisi();

        Godiva godiva = new Godiva();
        System.out.println(godiva.sirketGezisi());
        Ulkerspor ulkerspor = new Ulkerspor();
        System.out.println(ulkerspor.sirketGezisi());

        godiva.calismaSaatleri();
        ulkerspor.calismaSaatleri();




    }
}
