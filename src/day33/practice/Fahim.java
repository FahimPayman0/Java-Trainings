package day33.practice;

public class Fahim extends MBA{
    public void mbaSirketBilgileri() {     // overriding
        sirketIsmi = "MBA holding Company";
        ogrenciSayisi = 10;
        yazDonemikurs = false;
        System.out.println(sirketIsmi);
        System.out.println(ogrenciSayisi);
        System.out.println(yazDonemikurs);
    }
}
