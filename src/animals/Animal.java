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

    };
}
