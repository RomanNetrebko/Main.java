package com.company;
//Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color, а из класса Box
//        это свойство убрать. Все методы для работы с этим свойством тоже перенести из класса Box в класс ColorBox.
//        Свойства color в классе ColorBox и material в Box переделать на Enum'ы
//        (создать перечисления для цветов и материалов и задать хотя бы по несколько возможных значений)

   public class ColorBox extends Box {
      private String color;

      public ColorBox(){

      }
      public ColorBox (String color){
         this.color = color;
      }
      public ColorBox (String color, String material, int height , int length , int width){
         super(height, length, width, material);
         this.color = color;

      }

      public String getColor() {
         return color;
      }

      public void setColor(String color) {
         this.color = color;
      }

}
