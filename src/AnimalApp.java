import animals.Animal;
import factory.AnimalFactory;
import factory.AnimalType;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();
        AnimalFactory animalFactory = new AnimalFactory();

        Scanner scanner= new Scanner(System.in);
        Command currentCommand = null;

        while (currentCommand != Command.exit) {
            currentCommand = getCommand(scanner);
            if (currentCommand == Command.list) {
                if (animals.isEmpty()) {
                    System.out.println("В списке отсутствуют значения");
                }
                for (Animal animal : animals) {
                    System.out.println(animal);
                }
            } else if (currentCommand == Command.add) {
                AnimalType animalType = null;
                Animal animal = animalFactory.create(animalType);
                //самостоятельно - запросить параметры животного
                animals.add(animal);
                animal.say();
            }
        }
    }

    private static Command getCommand(Scanner scanner) {
        String commandInput = null;
        while (Command.notContaint(commandInput)) {
            if (commandInput != null) {
                System.out.println("Введена неверная команда");
            }
            System.out.printf("Введите одну из команда (%s) : ", String.join("/",Command.NAMES));
            commandInput = scanner.next();
        }
        return Command.fromString(commandInput);
    }
}
