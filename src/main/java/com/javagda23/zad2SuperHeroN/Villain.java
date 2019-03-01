package com.javagda23.zad2SuperHeroN;

public class Villain extends AbstractHero {
    public Villain(String name, HeroStatistics heroStatistics, TeamType teamType) {
        super(name, heroStatistics, teamType);
    }

    @Override
    public int getPower() {
        return (getHeroStatistics().getHealth() + getHeroStatistics().getAttack())*getHeroStatistics().getDefence();
    }

    @Override
    public String toStringParse() {
        return getClass().getSimpleName()+ "; " + getName() + "; " + getHeroStatistics().getHealth() + "; "
                + getHeroStatistics().getAttack() + "; " + getHeroStatistics().getDefence() + "; " + getTeamType();
    }
}
