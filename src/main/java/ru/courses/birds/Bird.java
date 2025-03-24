package ru.courses.birds;

abstract public class Bird {
    private String birdSpecies;

    Bird(String birdSpecies){
        this.birdSpecies = birdSpecies;
    }

    public String getBirdSpecies() {
        return birdSpecies;
    }
    public void sing() {}
}
