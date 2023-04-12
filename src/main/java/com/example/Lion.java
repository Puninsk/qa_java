package com.example;

import java.util.List;

public class Lion {
    boolean hasMane;
    String sex;
    Feline feline;

    public Lion(String sex, Feline feline) throws InterruptedException {
        this.sex = sex;
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new InterruptedException("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public int getKittensNumber() {
            return feline.getKittens();
    }

    public int getKittensNumber(int kittensNumber) {
        return feline.getKittens(kittensNumber);
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood();
    }
    public String getFamily() {
        return feline.getFamily();
    }
}
