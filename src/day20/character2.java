package day20;

public class character2 {
    public static void main(String[] args) {
        String text = "Hello World";
        String sayi = "5a";
        boolean statu = Character.isLetter(text.charAt(0));
        System.out.println(statu);

        boolean statu1 = Character.isDigit(sayi.charAt(0));
        System.out.println(statu1);

    }
}
