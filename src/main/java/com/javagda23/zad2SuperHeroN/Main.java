package com.javagda23.zad2SuperHeroN;

public class Main {
    public static void main(String[] args) {
        AbstractHero villain1 = HeroCreator.createVillainWithDefaultStats();
//        AbstractHero villain1 = HeroCreator.createVillain();
        AbstractHero superHero1 = HeroCreator.createSuperHeroWithDefaultStats();

        System.out.println(villain1.getHeroStatistics());
        System.out.println(superHero1.getHeroStatistics());
    }
}
