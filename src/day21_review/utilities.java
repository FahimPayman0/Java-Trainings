package day21_review;

public class utilities {

    /*public int toplam(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;}*/

    /*public static char ilkharfAl(String kelime){
        return kelime.charAt(0);


    }*/

    /*public static String  subStringAl(String strg, int sayi){
       return strg.substring(0,sayi);

    }*/

/*public static char sonKarakterAl(String str){
    String lowerStr = str.toLowerCase();
    char sonKarakter = lowerStr.charAt(lowerStr.length()-1);
    return sonKarakter;

    }*/

    public static String isContains(String str1, String str2){
        boolean statu = str1.contains(str2);
        return (statu)? "iceriyor" : "icermiyor";

    }




}
