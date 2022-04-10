package com.company;

public enum Color {
    RED("червоний"),
    BLECK("чорний"),
    WHITE("білий"),
    GREY("сірий"),
    GREEN("зелений");

    private String choice ;

    Color(String choice) {
        this.choice = choice;
    }

    public String getChoice(){
        return choice;
    }



}
