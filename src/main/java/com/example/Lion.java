package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    // Feline feline = new Feline();
    // Убрали зависимость Feline путем добавления параметра Feline feline в конструктор
    // Понизить уровень зависимости до родителей Predator или Animal невозможно, т.к. метод getKittens есть только в классе Feline

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
