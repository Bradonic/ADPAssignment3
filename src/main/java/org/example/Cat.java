package org.example;

public class Cat extends Animal
{
    public Cat()
    {
    }

    public Cat(String name, int age, String favouriteFood, int legs, String breed) {
        super(name, age, favouriteFood, legs, breed);
    }

    @Override
    public String makeSound()
    {
        return "Meow";
    }
}
