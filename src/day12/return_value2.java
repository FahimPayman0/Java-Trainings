package day12;

public class return_value2 {
    public static void main(String[] args) {
        boolean okuladevamdurumu = true;
        boolean derslerdengecmedurumu = true;


   boolean  diplomahakki=checkDiplomaEligibility(okuladevamdurumu, derslerdengecmedurumu);

   if (diplomahakki) {
       System.out.println("Tebtik");
   }else {
           System.out.println("malisif");
       }

    }
    public static boolean checkDiplomaEligibility(boolean okuladevamdurumu, boolean derslerdengecmedurumu){
        boolean diplomahakki = (okuladevamdurumu && derslerdengecmedurumu);
        return diplomahakki;
    }

}
