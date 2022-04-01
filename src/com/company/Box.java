package com.company;

public class Box {
    int height;
    int length;
    int width;

    Box (int newHeight , int newLenght , int newWidht){
        height = newHeight;
        length = newLenght;
        width = newWidht;
    }
    Box (){
    }
    public int volum(int newHeight, int newLenght, int newWidht) {
        int result = 0;
        result = newHeight * newLenght * newWidht;
        return result;
    }
}
