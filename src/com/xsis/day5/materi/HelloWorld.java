package com.xsis.day5.materi;

public class HelloWorld {

    private static int counter = 0; // static variable
    private String sayHello = "Hello Java"; // instance variable

    void sayHI(){
        System.out.println("Say Hi....");
    }

    static void sayStatic(){
        System.out.println("Say Static....");
    }

    public static void main(String[] args) {
        // call static variable
        System.out.println("Counter : " + counter);

        // call instance variable
        HelloWorld hw = new HelloWorld(); // hw object atau instance dari class HelloWorld
        System.out.println(hw.sayHello); // untuk call instance variable, harus di create dulu object nya

        // call method
        hw.sayHI();

        // call static
        sayStatic();
    }
}
