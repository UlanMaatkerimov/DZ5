package com.javalesson.dz5;

public class Hero {

    private int heroHealth;
    private int heroDamage;
    private String heroesSuperPower;


    public Hero(int heroHealth, int heroDamage, String heroesSuperPower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroesSuperPower = heroesSuperPower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;



    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroesSuperPower() {
        return heroesSuperPower;
    }
}
