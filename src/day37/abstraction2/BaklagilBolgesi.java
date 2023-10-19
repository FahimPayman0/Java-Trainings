package day37.abstraction2;

public class BaklagilBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Bakligil dan liste");
    }

    @Override
    public void stockKontrol() {
        System.out.println("Baklagil dan stok");
    }
}
