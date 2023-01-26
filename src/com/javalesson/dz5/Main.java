package com.javalesson.dz5;

public class Main {
    public static void main(String[] args) {


        Hero superman = new Hero(250,25);
        superman.getHeroHealth();
        superman.getHeroDamage();


        Hero spiderman = new Hero(200,20);
        spiderman.getHeroHealth();
        spiderman.getHeroDamage();


        Boss tanos = new Boss();
        tanos.setBossHealth(400);
        tanos.setBossDamage(40);
        tanos.setDefenceType("Magical");

        System.out.println("Tanos's health - " + tanos.getBossHealth());
        System.out.println("Tanos's damage - " + tanos.getBossDamage());
        System.out.println("Tanos's defence type - " + tanos.getDefenceType());

        createHeroes();
    }

    public static void createHeroes() {
        Hero batman = new Hero(250,25);
        Hero superman = new Hero(300,30);
        Hero flash = new Hero(200,20);


        Hero[] hero = {batman, superman, flash};
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].getClass().getSimpleName() + " length: " + hero[i].getHeroHealth() +
                    " " + "Damage: [" + hero[i].getHeroDamage() + "]");
        }

    }
}
