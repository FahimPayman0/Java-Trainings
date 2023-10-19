package day15;

public class Ev2 {
    public static void main(String[] args) {
        OturmaOdasi otormaodasi = new OturmaOdasi();
        YatakOdasi yatakodasi = new YatakOdasi();
        Banyo banyo = new Banyo();
        double toplamalan = otormaodasi.hesaplaDikdortgenAlan()+yatakodasi.hesaplaKareAlan()+ banyo.hesaplaUcgenAlan();

        System.out.println(toplamalan);
    }
}
