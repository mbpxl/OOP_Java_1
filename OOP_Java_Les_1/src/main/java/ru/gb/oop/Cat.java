package ru.gb.oop;

public class Cat extends Animal{
    public Cat(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    private void findFood() {
        System.out.println("Cat has found a food.");

    }

    private void findFood(int foodCount) {
        System.out.println("Cat has found a food. Count = " + foodCount);
    }

    private void wakeUp() {
        System.out.println("Wakey wakey wakey");
    }

    private void toSleep() {
        System.out.println("Cat is sleeping");
    }

    private void eat() {
        System.out.println("Cat has ate");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toSleep();
    }
}
