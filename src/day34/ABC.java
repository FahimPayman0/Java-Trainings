package day34;

public class ABC {
    String sirketIsmi;
    int yillikCiro;

    public ABC(String sirketIsmi, int yillikCiro) {
        this.sirketIsmi = sirketIsmi;
        this.yillikCiro = yillikCiro;
    }
    public void sirkBilgileri(){
        System.out.println(sirketIsmi);
        System.out.println(yillikCiro);
    }
}
