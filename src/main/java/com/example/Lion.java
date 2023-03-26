package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;
    private AnimalFamily animalFamily;
    private AnimalFood animalFood;

    public Lion(AnimalFamily animalFamily) {
        this.animalFamily = animalFamily;
    }

    public Lion(AnimalFood animalFood) {
        this.animalFood = animalFood;
    }

    public Lion(String sex) throws InterruptedException {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new InterruptedException("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittensNumber() {
            return animalFamily.getKittens();
    }

    public int getKittensNumber(int kittensNumber) {
        return animalFamily.getKittens(kittensNumber);
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalFood.getFood();
    }

    public String getFamily() {
        return animalFamily.getFamily();
    }

}
