package day36.encapsulation4;

public class Film {
    private String filmAdi;
    private String yonetmen;
   private int vizyonYiili;
    private String tur;

    public Film(String filmAdi, String yonetmen, int vizyonYiili, String tur) {
        this.filmAdi = filmAdi;
        this.yonetmen = yonetmen;
        this.vizyonYiili = vizyonYiili;
        this.tur = tur;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public int getVizyonYiili() {
        return vizyonYiili;
    }

    public String getTur() {
        return tur;
    }

    public void setFilmAdi(String filAdi) {
        this.filmAdi = filAdi;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public void setVizyonYiili(int vizyonYiili) {
        this.vizyonYiili = vizyonYiili;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmAdi='" + filmAdi + '\'' +
                ", yonetmen='" + yonetmen + '\'' +
                ", vizyonYiili=" + vizyonYiili +
                ", tur='" + tur + '\'' +
                '}';
    }
}
