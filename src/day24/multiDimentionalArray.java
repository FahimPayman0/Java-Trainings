package day24;

public class multiDimentionalArray {
    public static void main(String[] args) {

        String [][] ogrenciBilgileri = {
                {"925","Elif","Yidiz","Antalya"},
                {"369","Murat","Kara","Izmir"},
                {"988","Hande","Akdeniz","Izmir"},
                {"256","Hasan","Akdeniz","Istanbul"},
                {"125","Ferit","Demir","Aydin"},
                {"341","Cemile","Gok","Aydin"}
        };
        
        for (int i = 0; i < ogrenciBilgileri[3].length; i++) {
            System.out.println(ogrenciBilgileri[3][i]);
            
        }

        
    }
}
