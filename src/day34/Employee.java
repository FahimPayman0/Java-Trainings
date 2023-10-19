package day34;

public class Employee {
    String adsoyad;
    int calisanSaat;
    final double saatlikUcret = 20;


    public Employee(String adsoyad, int calisanSaat) {
        this.adsoyad = adsoyad;
        this.calisanSaat = calisanSaat;

    }
    public void maasHisapla(){
        System.out.println(adsoyad);
        System.out.println(calisanSaat);
        double maas = calisanSaat*saatlikUcret;
        System.out.println(maas);
    }
}
