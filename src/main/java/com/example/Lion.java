package com.example;

import java.util.List;

public class Lion {

    private final boolean hasName;
    private final Predator predator;

    public Lion(String sex, Predator predator) throws Exception {
        this.predator = predator;
        if ("Самец".equals(sex)) {
            hasName = true;
        } else if ("Самка".equals(sex)) {
            hasName = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

    public String getFamily() {
        return "Кошачьи";
    }
}
