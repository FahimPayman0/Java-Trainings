package day16;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter your name:");

        String name = scanner.nextLine();
        System.out.println("Name :"+name);

    }
}
