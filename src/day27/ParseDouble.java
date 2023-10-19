package day27;

public class ParseDouble {
    public static void main(String[] args) {
        // Task ParseDouble()
        String senston = "$49.99";
        String net  = "$54.80";
        String timo ="$13.89";
        String toplam  = "$118.68";

        String senstonArr = senston.replace("$","");
        String netArr = net.replace("$","");
        String timoArr = timo.replace("$","");
        String toplamArr = toplam.replace("$","");

        System.out.println(senstonArr+netArr+timoArr+ toplamArr);

        Double senstonInt = Double.parseDouble(senstonArr);
        Double netInt = Double.parseDouble(netArr);
        Double timoInt = Double.parseDouble(timoArr);
        Double toplamInt = Double.parseDouble(toplamArr);


        String sonuc = (senstonInt+netInt+timoInt == toplamInt)? "Esit": "Degil";
        System.out.println(sonuc);  // resul is degil because there is some roundoff issue


    }
}
