package com.javagda23.zad2SuperHeroN;

import lombok.Data;

@Data
public abstract class AbstractHero {
    private String name;
    private HeroStatistics heroStatistics;
    private TeamType teamType;

    public AbstractHero(String name, HeroStatistics heroStatistics, TeamType teamType) {
        this.name = name;
        this.heroStatistics = heroStatistics;
        this.teamType = teamType;
        addStatistic();
    }

    public void addStatistic() {
        switch (teamType) {
            case RED:
                heroStatistics.increaseHealth(50);
                break;
            case BLUE:
                heroStatistics.increaseAttack(50);
                break;
            case GREEN:
                heroStatistics.increaseDefence(50);
                break;
        }
    }

    public abstract int getPower();


    public abstract String toStringParse();

    @Override
    public String toString() {
        return "AbstractHero{" +
                "name='" + name + '\'' +
                ", heroStatistics=" + heroStatistics +
                ", teamType=" + teamType +
                '}';
    }
}
