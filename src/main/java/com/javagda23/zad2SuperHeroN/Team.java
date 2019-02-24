package com.javagda23.zad2SuperHeroN;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
public class Team {
    private TeamType type;
    private List<AbstractHero> heroes;
    private AbstractHero teamLeader;
    private Side side;
    int count = 0;

    public Team(TeamType type) {
        this.side = Side.UNKNOWN;
        this.type = type;
        this.heroes = new ArrayList<>();
    }

    public void addHeroToTeam(AbstractHero hero) throws InvalidHeroTeamException {
        if(hero.getTeamType() == this.getType()){
            heroes.add(hero);
        } else
            throw new InvalidHeroTeamException("Can't add hero to the team.");
    }

    public AbstractHero getTeamLeader() {
        Collections.sort(heroes, new Comparator<AbstractHero>() {
            @Override
            public int compare(AbstractHero o1, AbstractHero o2) {
                if (o1.getPower() > o2.getPower()) {
                    return -1;
                } else if (o1.getPower() < o2.getPower()) {
                    return 1;
                }
                return 0;
            }
        });

        return heroes.get(0);
    }

    public int getTeamPower(){
        int power = 0;
        for (AbstractHero hero : heroes) {
            power += hero.getPower();
        }

        return power;
    }

    public void buffTeamPower(){
        if(count == 0){
            for (AbstractHero hero : heroes) {
                if(hero instanceof Villain){
                    hero.getHeroStatistics().increaseHealth(10);
                } else if (hero instanceof SuperHero){
                    hero.getHeroStatistics().increaseDefence(10);
                }
            }
        } else System.out.println("Can't do this anymore.");

        count++;
    }
}
