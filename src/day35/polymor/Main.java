package day35.polymor;

public class Main {
    public static void main(String[] args) {
        MBA mba = new MBA();
        System.out.println("sirketin toplam calisan sayisi :" + mba.getTotalEmployees());


        BranchA branchA = new BranchA();
        System.out.println("subenin toplam calisan sayisi :" + branchA.getTotalEmployees());
    }
}
