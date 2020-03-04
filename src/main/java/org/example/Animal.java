package org.example;

public abstract class Animal
{
    private String name;
    private int age;
    private String favouriteFood;
    private int legs;
    private String breed;

    public Animal()
    {
    }

    public Animal(String name, int age, String favouriteFood, int legs, String breed)
    {
        this.name = name;
        this.age = age;
        this.favouriteFood = favouriteFood;
        this.legs = legs;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String makeSound()
    {
        return "Growl";
    }

    @Override
    public boolean equals(Object object)
    {
        return true;
    }
}
