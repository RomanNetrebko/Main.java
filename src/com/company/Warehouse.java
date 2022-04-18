package com.company;
import java.util.Arrays;
public class Warehouse {

    private Box[] Box;
    private int num;
    private int counter;

    public Warehouse() {
        this.num = 5;
        Box = new Box[num];
    }
    public Warehouse(int num) {
        this.num = num;
        Box = new Box[num];
    }
    public void addBox(Box box) {
        if(counter+1 >= num){
        System.out.println("Склад повний");
        } else {
            Box[++counter] = box;
        }
    }
    @Override
    public String toString() {
        return "Warehouse" + " "+
                "Box =" +  Arrays.toString(Box)+
                ", num=" + num +
                ", counter=" + counter +
                ' ';
    }
}
