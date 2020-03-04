package org.example;

public class Bird extends Animal
{
    private int wingSpan;

    public Bird()
    {
    }

    public Bird(String name, int age, String favouriteFood, int legs, String breed, int wingSpan) {
        super(name, age, favouriteFood, legs, breed);
        this.wingSpan = wingSpan;
    }

    @Override
    public String makeSound()
    {
        return "Screech";
    }

    public String toString()
    {
        return String.format("Wingspan: %d", wingSpan);
    }
}
