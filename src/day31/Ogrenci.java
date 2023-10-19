package day31;

public class Ogrenci {
    String isim;//Ahmet
    String soyIsim;//vural
    int yas;
    String nickName;
    int derseGelmedigiGunSayisi;
    boolean ogrenimDurumu;
    char ehliyet;
    boolean ehliyetYetkinlik;
    double burs;
    double aylikKazanc;
    double aylikGider;
    double matematikVizeSinavSonucu;
    double matematikFinalSinavSonucu;


    public Ogrenci(String isim, String soyisim, int yas){
        this.isim = isim;
        this.soyIsim = soyisim;
        this.yas= yas;

    }
    public String nickname(){             // this is method
        String nickname = isim + soyIsim + "nyyy";
        return nickname;
    }

    public String fullname(){
        String nickname = isim+soyIsim;
        return nickname;
    }

    public boolean EhliyetYetkinligi(){

        if (yas>=18){
            ehliyetYetkinlik = true;
        }else {
            ehliyetYetkinlik=false;
        }
        return ehliyetYetkinlik;
    }

}
