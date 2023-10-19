package day25;

public class string_metods_review {
    public static void main(String[] args) {

        // String methods

        String str = "Hello World! ";
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("dunya"));
        System.out.println(str.charAt(6));
        System.out.println(str.equals("hello World!"));
        System.out.println(str.equalsIgnoreCase("hello world!"));
        System.out.println(str.replace("Hello","Problem"));
        System.out.println(str.trim());
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("!"));
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,str.length()-1));
        System.out.println(str.contains("llo"));


    }
}
