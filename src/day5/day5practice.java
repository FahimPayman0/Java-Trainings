package day5;

public class day5practice {
    public static void main(String[] args) {

        // if statement
    /*    int x = 5;
        int y = 6;
        int z = 7;
        if (x>z) {
            System.out.println( "selamunAleykum!!!");
        }*/

      /*  int johninMarki = 55;
        if (johninMarki>50) {
            System.out.println("johnin Marki 50 den buyuktur : "+ "Tebrikler");
        }*/

        /*double kimya = 55.8;
        double Mathmatic = 60.5;
        int Biologi = 34;
        double ortalama = (kimya+Mathmatic+Biologi)/3;
        if (ortalama>70){
            System.out.println("uzgunum sinavlari tekrar girmaniz gerekir");
        }
        else {
            System.out.println("tebrikler");
        }*/

        /*int maryYas = 25;   // if + else
        int johnYas = maryYas+7;
         johnYas %=2;
         if (johnYas==0){
             System.out.println("cift");
         } else {
             System.out.println("tek");
         }*/


        // if + else if + if

       /* int x= 5;
        int y= 5;
        int z= 10;
        if (x<y){
            System.out.println( "surprise");
        } else if (x>y) {
            System.out.println("Tuhaf");

        } else {
            System.out.println("olur");
        }*/

        // if else if else   Task

       /* int johnmathpuani = 100;
        if (johnmathpuani<50 && johnmathpuani>0){
            System.out.println("failed");

        } else if (50<=johnmathpuani && johnmathpuani<60) {
            System.out.println("D");

        } else if (60<=johnmathpuani && johnmathpuani<70) {
            System.out.println("C");

        } else if (70<=johnmathpuani && johnmathpuani<80) {
            System.out.println("B");

        } else if (80<=johnmathpuani && johnmathpuani<90) {
            System.out.println("A");

        } else if (90<=johnmathpuani && johnmathpuani<=100) {
            System.out.println("A+");

        }else {
            System.out.println("NA");

        }*/

        /*int age = 15;
        if (age<18){
            System.out.println("yuzme");
            
        } else if (18>age && age<50) {
            System.out.println("kosu");
            
        }else if (age>50) {
            System.out.println("yoga");

        }*/

        /*int age = 60;
        if (age<18){
            System.out.println("yuzme spor yapabilir");
        } else if (18<age && age<50) {
            System.out.println("kosu spor yapabilir");
            
        } else if (age>50) {
            System.out.println("yoga spor yapabilir");
            
        }*/


        /*int johnincomemonthly = 2500;
        if (johnincomemonthly>2000){
            System.out.println("tebrikler");
        }else {
            System.out.println("very less yaw");
        }*/

        /*boolean status = true;
        if (status){
            System.out.println("here we goooo");
        } else {
            System.out.println("try again later");
        }

        System.out.println("bu baska");*/

        //!=
        /*int x=11;
        int y=12;
        boolean status = x!=y;
        if (status){
            System.out.println("x is not equal to y");
        } else {
            System.out.println("x is equal to y");
        }*/

        // &&
       /* int x= 6;
        int y= 6;
        int z= 12;
        boolean status = x==y && x+y==z;  // true && true =true
        if (status){
            System.out.println("x=y and x+y=z");
        }else {
            System.out.println("equation && is false");
        }*/

        // ||
       /* int x= 6;
        int y= 6;
        int z= 13;
        boolean status = x==y || x+y==z; // true || false = true
        if (status){
            System.out.println("sinavden gectin yarim yamalak");
        }else {
            System.out.println("equation || is false");
        }*/

        // !
       /* boolean status = true;
        if (!status){
            System.out.println("true ast");
        }else {
            System.out.println("true nest");
        }*/

        // Task

        /*int age= -2101;
        if (0<=age && age<=18){
            System.out.println("yuzme yapabilirsin");
        } else if (age>18 && age<=50) {
            System.out.println("kosme yapabilirsin");

        } else if (age>50) {
            System.out.println("yoga tecihimiz dir sizin icin");

        }else {
            System.out.println("gecersiz bir rekem");
        }*/

        /*int age = 65;
        boolean yuzme = true;
        boolean kosu = false;
        boolean yoga = false;
        if ((0<age && age<=18) && yuzme==false){
            System.out.println("yuzme sporunu yapabilir");
        } else if ((age>18 && age<=50) && kosu==false) {
            System.out.println("kosme sporunu yapabilirsin");

        } else if ((age>=60) && yoga== false) {
            System.out.println("yoga sizin icin tercihimizdir");

        }else {
            System.out.println("sistemde sizin icin uygun spor bulunamadi");
        }*/

        /*double ahmad =2500.75;
        double mahmut=3010.09;
        int ali =10100;
        double toplam = ahmad+mahmut+ali;
        if (toplam >=15000){
            System.out.println("BMW araba alabilirsiniz");
        }else {
            System.out.println("maaslariniz yetmiyor, daha fazla calisiniz");
        }*/

        /*int oyun1 = 55;
        int oyun2 = 70;
        int oyun3 = 90;
        int total = oyun1+oyun2+oyun3;
                if(total>200){
                    System.out.println("tebrikler bir sonraki ture gecebilirsin");
                }else {
                    System.out.println("uzgunuz tekrar oyneyebilirsin");
                }*/


        int salary = -3500;
        if (salary < 1000 && salary >= 0) {
            System.out.println("No credit for you");
        } else if (salary >= 1000 && salary <= 2000) {
            System.out.println("You can get 10000 credit");

        } else if (salary > 2000 && salary <= 3000) {
            System.out.println(" You can get 50000 credit");

        } else if (salary > 3000 && salary <= 4000) {
            System.out.println("You can get 100000 credit");

        } else {
            System.out.println(" Not valid ");
        }


    }
}
