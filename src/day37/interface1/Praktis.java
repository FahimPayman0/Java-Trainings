package day37.interface1;

public interface Praktis {

    public void test();       // no need to write public as it is default public

    void abc();

    default void defaul_xyz(){
        System.out.println("defaul method");
    }
    static void static_xyz(){


    }
}
