package com.company;

import Exceptions.BoxConstructorExceptions;

public class Main {

    public static void main(String[] args) {

        Box b1 = new Box(3, 3, 2);
        Box b2 = new Box(3, 3, 3);
        Box b3 = new Box(4, 4, 4);
        Box b4 = new Box(5, 5, 5);
        Box b5 = new Box(2, 3, 1);
        System.out.println(b1.volum());
        System.out.println(b2.volum());
        System.out.println(b3.volum());
        System.out.println(b4.volum());
        System.out.println(b5.volum());

        try {
            ColorBox b6 = new ColorBox(Color.BLECK.getChoice(), Material.PLASTIC.getValue(), 2, 3, 4);
            Box b7 = new Box(9, 9, 9, Material.WOOD.getValue());
            ColorBox b8 = new ColorBox(Color.WHITE.getChoice(),Material.PAPER.getValue(),5,3,4);
            System.out.println(b6);
            System.out.println(b7);
            Warehouse w1 = new Warehouse(5);
            w1.addBox(b6);
            w1.addBox(b7);
            w1.addBox(b8);
            System.out.println(w1.toString() );

        } catch (BoxConstructorExceptions e) {
            System.out.println(e.getMessage());
        }
        Color c = Color.GREEN;
        System.out.println(c.getChoice());
        Material m = Material.CARDBOARD;
        System.out.println(m.getValue());
        System.out.println(b1.toString());
    }

}

