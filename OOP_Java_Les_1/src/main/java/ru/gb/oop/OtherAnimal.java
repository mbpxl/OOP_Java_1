package ru.gb.oop;

public class OtherAnimal extends Animal{
    private int eyesCount;

    public OtherAnimal(String name, Integer age, String color, boolean isVaccination, String species, Owner owner, Integer legsCount) {
        super(name, age, color, isVaccination, species, owner, legsCount);
        this.eyesCount = 2;
    }

    public OtherAnimal() {
        this(null, null, null, false, null, null, null);
    }

    public int getEyesCount() {
        return eyesCount;
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "I am other Animal!";
    }
}
