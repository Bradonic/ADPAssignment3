package org.example;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Animal cat = new Cat("Snow", 5, "Fish", 4, "Siamese");
    Animal dog = new Dog("Fluffy", 2, "Dog Treats", 4, "Rottweiler");
    Animal bird = new Bird("Storm", 3, "Snakes", 2, "Eagle", 2);
    Bird bird2 = new Bird("Aero", 2, "Snakes", 2, "Eagle", 3);
    BaldEagle eagle = new BaldEagle("U.S.A", bird2);
    @Test
    public void getName()
    {
        assertEquals("Snow", cat.getName());
        assertEquals("Fluffy", dog.getName());
        assertEquals("Storm", bird.getName());
    }

    @Test
    public void getAge()
    {
        assertEquals(5, cat.getAge());
        assertEquals(2, dog.getAge());
        assertEquals(3, bird.getAge());
    }

    @Test
    public void getFavouriteFood()
    {
        assertEquals("Fish", cat.getFavouriteFood());
        assertEquals("Dog Treats", dog.getFavouriteFood());
        assertEquals("Snakes", bird.getFavouriteFood());
    }

    @Test
    public void getLegs()
    {
        assertEquals(4, cat.getLegs());
        assertEquals(4, dog.getLegs());
        assertEquals(2, bird.getLegs());
    }

    @Test
    public void getBreed()
    {
        assertEquals("Siamese", cat.getBreed());
        assertEquals("Rottweiler", dog.getBreed());
        assertEquals("Eagle", bird.getBreed());
    }

    @Test
    public void makeSound()
    {
        assertEquals("Meow", cat.makeSound());
        assertEquals("Woof", dog.makeSound());
        assertEquals("Screech", bird.makeSound());
    }

    @Test
    public void objectEquality()
    {
        assertEquals(cat, 23);
    }

    @Test
    public void objectIdentity()
    {
        Object actual = cat;
        assertSame(cat, actual);
    }

    @Test
    public void compositionTesting()
    {
        System.out.println(eagle.toString());
    }
}
