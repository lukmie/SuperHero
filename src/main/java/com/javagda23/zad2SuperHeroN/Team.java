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

    public Team(TeamType type) {
        this.type = type;
        this.heroes = new ArrayList<>();
    }

    public boolean addHeroToTeam(AbstractHero hero){
        if(hero.getTeamType() == this.getType()){
            heroes.add(hero);
            return true;
        } else
            return false;
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
}
