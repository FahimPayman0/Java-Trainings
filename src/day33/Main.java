package day33;

public class Main {                                // INHERITANCE    MIRAS
    public static void main(String[] args) {
        Torun torun = new Torun();
       String kalanMulk = torun.mulk;
       int kalanPara = torun.para;
        System.out.println(kalanMulk);
        System.out.println(kalanPara);
        torun.sacRengi();

        torun.haberlesme();


        Dede dede = new Dede();
        dede.haberlesme();
    }
}
