package com.company;

import static java.lang.System.*;

public class Box {
    int height;
    int length;
    int width;
    String color;
    String material;


   public Box (int height , int length , int width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        if (height <= 0) {
              System.out.println("Помилка " + volum());
        } else{  height = height;
            }

    }
     public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        if (length <= 0) {
            System.out.println("Помилка " + volum());
        } else{
            length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        if (width <= 0) {
            System.out.println("Помилка " +volum());
        } else{
            width = width;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

   public Box (int height , int length , int width, String color , String material ){
        this(height, length, width);
        this.color = color;
        this.material = material;

    }
    public Box (){
    }
    public int volum() {
        int result = 0;
       return result = height * length * width;
           }
}
