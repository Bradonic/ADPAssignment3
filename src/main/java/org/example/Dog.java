package org.example;

public class Dog extends Animal
{
    public Dog()
    {
    }

    public Dog(String name, int age, String favouriteFood, int legs, String breed) {
        super(name, age, favouriteFood, legs, breed);
    }

    @Override
    public String makeSound()
    {
        return "Woof";
    }
}
