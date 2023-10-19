package day37.abstraction2;

public class SutUrunleriBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Sut Urun Listesi");
    }

    @Override
    public void stockKontrol() {
        System.out.println("Stok Kontrol sut bolgesinden ");
    }
}
