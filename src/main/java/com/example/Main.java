package com.example;

public class Main {

    public static void main(String[] args) throws Exception {
        // Создать объект класса Lion
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        System.out.println("Количество львят " + lion.getKittens());
        System.out.println("Лев является самцом? " + lion.doesHaveMane());
        System.out.println("Чем питается лев? " + lion.getFood());

    }
}
