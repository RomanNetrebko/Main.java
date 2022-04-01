package com.company;

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        Box b4 = new Box();
        Box b5 = new Box();

        System.out.println(b1.volum(2,2,2));
        System.out.println(b2.volum(3,3,3));
        System.out.println(b3.volum(4,4,4));
        System.out.println(b4.volum(5,5,5));
        System.out.println(b5.volum(2,3,4));
    }
}
