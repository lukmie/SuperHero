package com.javagda23.zad2SuperHeroN;

public class SuperHero extends AbstractHero {
    public SuperHero(String name, HeroStatistics heroStatistics, TeamType teamType) {
        super(name, heroStatistics, teamType);
    }

    @Override
    public int getPower() {
        return (getHeroStatistics().getDefence() + getHeroStatistics().getAttack())*getHeroStatistics().getHealth();
    }
}
