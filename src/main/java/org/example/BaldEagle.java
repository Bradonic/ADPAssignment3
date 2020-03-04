package org.example;

public class BaldEagle
{
    private String habitat;
    private Bird bird;

    public BaldEagle(String habitat, Bird bird) {
        this.habitat = habitat;
        this.bird = bird;
    }

    public String toString()
    {
        return String.format("%s\n" +
                "Habitat: %s",bird, habitat);
    }
}
