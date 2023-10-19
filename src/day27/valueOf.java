package day27;

public class valueOf {
    public static void main(String[] args) {
        // valueOf()
        String kamera = "$2996.95";
        String memory  = "$129.95";
        String bettry ="$54.95";
        String toplam  = "$3181.85";

        String kameraArr = kamera.replace("$","");
        String memoryArr = memory.replace("$","");
        String bettryArr = bettry.replace("$","");
        String toplamArr = toplam.replace("$","");

        System.out.println(kameraArr+memoryArr+bettryArr+ toplamArr);

        Double kameraInt = Double.valueOf(kameraArr);
        Double memoryInt = Double.valueOf(memoryArr);
        Double bettryInt = Double.valueOf(bettryArr);
        Double toplamInt = Double.valueOf(toplamArr);
        String sonuc = (kameraInt+memoryInt+bettryInt == toplamInt)? "Esit": "Degil";
        System.out.println(sonuc);

    }
}
