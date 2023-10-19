package day12;

public class return_value {
    public static void main(String[] args) {
        String name = "john";
        System.out.println(NickNameGenerator(name));
    }


    public static String NickNameGenerator(String name){
        String Nickname = name +"nnny";
        return Nickname;
    }

}
