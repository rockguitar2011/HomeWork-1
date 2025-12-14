package animals;

import javax.swing.*;

public abstract class Animal {
    private String name;
    private int age;
    private float weight;
    private Color color = Color.UNKNOWN;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s.", name,,weight,color.getValue());
    }

    private String getColorValue () {
        if (color == null) {
         return "Неизвестный";
        }
        return color.getValue();
    }

    private String getAgeSuffix() {
    int remainder10 = age % 10;
    int remainder100 = age % 100;
    if (remainder10 == 1 && remainder100 != 11) {
        return "Год";
    }
    if (remainder10 >= 2 && remainder10 <= 4 && remainder100 != 12 && remainder100 != 13 && remainder100 != 14) {
        return "Года";
    }
    return "Лет";
    }
}
