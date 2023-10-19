package day37.abstraction;

public class Ulkerspor extends Ulker{

    public  String sirketGezisi() {
        return "Ulkerspor ile mutlu bir kamp gezisi";
    }

    @Override
    public void calismaSaatleri() {
        System.out.println("Ulkerspor calisanlari 10 saat calismak zorunde");
    }
}
