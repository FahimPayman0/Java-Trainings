package day36.encapsulation4;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Adventure Quest","Cinema Master",2023,"Macera");
        System.out.println(film.getFilmAdi());
        System.out.println(film.getYonetmen());

        System.out.println(film.getVizyonYiili());
        film.setVizyonYiili(2024);
        System.out.println(film.getVizyonYiili());

        System.out.println(film.getTur());
        film.setTur("Bilim Kurgu");
        System.out.println(film.getTur());

        System.out.println(film.toString());


        Film film1 = new Film("mister Bean ","Cinema Max",2024,"Comedy");
        System.out.println(film1.toString());




    }
}
