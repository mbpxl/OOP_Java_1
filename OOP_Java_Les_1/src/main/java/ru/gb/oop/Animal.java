package ru.gb.oop;

public class Animal {
    private String name;
    private Integer age;
    private String color;
    private boolean isVaccination;
    private String species;
    private Owner owner;
    private Integer legsCount;

    public Animal(String name, Integer age, String color, boolean isVaccination, String species, Owner owner, Integer legsCount) {
//        Полю этого объекта под названием name присвоить name, которое пришло к тебе в аргументе
        this.name = name;
        this.age = age;
        this.color = color;
        this.isVaccination = isVaccination;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, Integer legsCount) {
        this(null, null, color, false, species, null, legsCount);
//        this.color = color;
//        this.species = species;
//        this.legsCount = legsCount;
    }

    public Integer getAge() {
        int count = 0; // -> переменная (другая область видимости)
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void foo() {
        System.out.println("I am foo method");
        int min = Math.min(1, 3);
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}
