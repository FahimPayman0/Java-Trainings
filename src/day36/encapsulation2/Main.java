package day36.encapsulation2;

public class Main {                                     // using Getter, Setter and toString
    public static void main(String[] args) {
        Game game = new Game("Super QA", 1, true);

        game.getHeroName();
        System.out.println(game.getHeroName());

        game.setHeroAge(2);
        System.out.println(game.getHeroAge());

        game.toString();
        System.out.println(game.toString());














    }
}
