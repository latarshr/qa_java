package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Animal {

    private final Map<String, List<String>> foodMap;

    public Animal() {
        foodMap = new HashMap<>();
        foodMap.put("Травоядное", List.of("Трава", "Различные растения"));
        foodMap.put("Хищник", List.of("Животные", "Птицы", "Рыба"));
    }

    public List<String> getFood(String animalKind) throws Exception {
        List<String> food = foodMap.get(animalKind);
        if (food == null) {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
        return food;
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}
