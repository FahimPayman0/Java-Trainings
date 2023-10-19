package day36.encapsulation3;

public class Main {
    public static void main(String[] args) {

        Album album = new Album("Summer Vibes", "Sunny Artist", 2023,"Pop");

        System.out.println(album.getAlbumName()+",    "+album.getArtistName());

        System.out.println(album.getReleaseYear());
        album.setReleaseYear(2024);
        System.out.println(album.getReleaseYear());

        System.out.println(album.getGenre());
        album.setGenre("Electronic");
        System.out.println(album.getGenre());

        System.out.println(album.toString());


    }
}
