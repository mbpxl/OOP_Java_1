package ru.gb.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Taison", 5, "black-white", true, "some", new Owner("Egorka"), 4);
        Animal wildAnimal = new Animal("Grey", "some", 3); // wildAnimal - ссылка на экземпляр класса Animal
        System.out.println(animal.getAge());
        animal.setAge(10);
        Animal.foo();

        System.out.println(animal);

        OtherAnimal otherAnimal = new OtherAnimal("Yadviga", 1, "grey", true, "some", new Owner("Artem"), 4);
        otherAnimal.getAge();
        System.out.println(otherAnimal);


        Animal cat = new OtherAnimal();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("grey", "some", 4));
        animals.add(new Cat("white", "some", 4));
        animals.add(cat);

        System.out.println(animals);
/*
        for (Animal item: animals) {
            if (item instanceof OtherAnimal) {
                System.out.println(((OtherAnimal) item).getEyesCount());
            } else if (item instanceof Cat) {
                ((Cat) item).findFood(3);
                ((Cat) item).findFood();
            }
        }
 */

        Cat taison = new Cat("grey", "some", 4);

        taison.hunt();
    }
}