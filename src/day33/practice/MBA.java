package day33.practice;

public class MBA {    // if we use final instead of public, then no class can use this MBA class with extends or Inheritance.
    String sirketIsmi;
    int ogrenciSayisi;
    boolean yazDonemikurs;

    public void mbaSirketBilgileri(){     //  overriding
        sirketIsmi = "MBA Company";
        ogrenciSayisi = 50;
        yazDonemikurs = true;
        System.out.println(sirketIsmi);
        System.out.println(ogrenciSayisi);
        System.out.println(yazDonemikurs);
    }
}
