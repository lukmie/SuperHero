package com.javagda23.zad2SuperHeroN;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Team {
    private TeamType type;
    private List<AbstractHero> heroes;

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
}
