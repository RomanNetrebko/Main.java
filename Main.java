package com.company;

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box(2,3,2);
        Box b2 = new Box(3,3,3);
        Box b3 = new Box(4,4,4);
        Box b4 = new Box(5,5,5);
        Box b5 = new Box(2,3,1);


        System.out.println(b1.volum());
        System.out.println(b2.volum());
        System.out.println(b3.volum());
        System.out.println(b4.volum());
        System.out.println(b5.volum());
    }
}
