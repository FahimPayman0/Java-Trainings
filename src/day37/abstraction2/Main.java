package day37.abstraction2;

public class Main {
    public static void main(String[] args) {
        BaklagilBolgesi baklagilBolgesi = new BaklagilBolgesi();
        SutUrunleriBolgesi sutUrunleriBolgesi = new SutUrunleriBolgesi();
        baklagilBolgesi.urunListele();
        baklagilBolgesi.stockKontrol();
        sutUrunleriBolgesi.stockKontrol();
        sutUrunleriBolgesi.urunListele();
    }
}
