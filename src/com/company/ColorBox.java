package com.company;
//Для классов Box и ColorBox из предыдущей домашки переопределить метод toString класса Object,
// в котором в реализации класса Box возвращать информацию о длине, ширине и высоте, а также материала коробки,
// а для класса ColorBox - всю ту же информации плюс информацию о цвете коробки.+

//Добавить в конструктор класса Box генерацию исключения если хоть одна из сторон была задана неверно
// (меньше либо равна нулю) и обрабатывать это исключение в месте создания экземпляра коробки (как Box так и ColorBox).+

//Также создать класс Склад (Warehouse, например), который будет в себе содержать массив коробок (именно базовый тип
// коробок - Box) и количество коробок, которые уже добавлены в этот массив. Массив создавать в конструкторе этого
// класса (размер массива принимать как параметр конструктора).
// Реализовать метод в этом классе для добавления коробки
// в массив (тип брать опять же базовый - Box), предусмотреть валидацию - проверять, можно ли ещё добавить в массив
// коробку, количество добавленных коробок не должно превышать длину массива.
// Также переопределить метод toString для
// этого класса - который будет возвращать информацию о всех коробках, которые хранит в себе склад.

//В методе main создать экземпляр класса Склад (задать его вместимость с помощью конструктора). Заполнить склад
// коробками (разными - как экземплярами Box, так и ColorBox) и вывести информацию о складе (вызвать метод склада
// toString).

import Exceptions.BoxConstructorExceptions;

public class ColorBox extends Box {
      private String color;

      public ColorBox(Color grey, Material paper, int height, int length, int width){

      }
      public ColorBox (String color){
         this.color = color;
      }
      public ColorBox (String color, String material, int height , int length , int width){
         super(height, length, width, material);
          if(height <= 0 || length <= 0 || width <=0  ){
              throw new BoxConstructorExceptions("Помилка! Число повинно бути біше нуля");
          }
         this.color = color;

      }

      public String getColor() {
         return color;
      }

      public void setColor(String color) {
         this.color = color;
      }

      @Override
      public String toString() {
         StringBuilder result = new StringBuilder();
         result.append("ColorBox: color").append('=' ).append(color).append(' ').append(super.toString());
         return result.toString();
      }
   }
