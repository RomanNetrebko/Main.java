package com.company;

public enum Material {
    PAPER("папір"),
    WOOD("дерево"),
    PLASTIC("пластик"),
    CARDBOARD("картон"),
    METAL("залізо");
    private String value;

    Material(String value){
       this.value = value;

    }
    public String getValue() {
        return value;
    }
}
