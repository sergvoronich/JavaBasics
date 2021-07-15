package Homework_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App2 {

    public static void printKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        System.out.println(keys);
    }

    public static void main(String[] args) {
        Pet cat = new Cat("Мурка");
        Pet dog = new Dog("Рэкс");
        Pet parrot = new Parrot("Кузя");

        Map<String, Pet> pets = new HashMap<>();
        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);

        printKeys(pets);

    }
}
