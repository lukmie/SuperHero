package com.javagda23.zad2SuperHeroN;

public abstract class HeroCreator {
    public static AbstractHero createSuperHero(String name, HeroStatistics heroStatistics, TeamType team){
        return new SuperHero("Jack", new HeroStatistics(60,70,65), TeamType.RED);
    }

    public static AbstractHero createVillain(String name, HeroStatistics heroStatistics, TeamType team){
        return new Villain("John", new HeroStatistics(10,10,10), TeamType.BLUE);
    }

}
