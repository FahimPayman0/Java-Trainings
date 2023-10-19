package day37.abstraction;

public class Godiva extends Ulker{

    public  String sirketGezisi() {
        return "Godiva ile mutlu bir gezi";
    }

    @Override
    public void calismaSaatleri() {
        System.out.println("Godiva calisanlari 8 saat calismak zorunde");
    }
}
