package com.javagda23.zad2SuperHeroN;

import com.javagda23.zad4.Student;
import lombok.Data;

import java.util.*;

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

    public void removeHeroFromTeam(AbstractHero hero){
        Iterator<AbstractHero> iterator = heroes.iterator();
        while (iterator.hasNext()) {
            AbstractHero abstractHero = iterator.next();
            if (abstractHero.equals(hero)) {
                iterator.remove();
            }
        }
    }

    public void setSideByCount() {
        int villainCount = 0;
        int superHeroCount = 0;
        for (AbstractHero hero : heroes) {
            if(hero instanceof Villain){
                villainCount++;
            } else if (hero instanceof SuperHero){
                superHeroCount++;
            }
        }
        if (villainCount > superHeroCount){
            this.side = Side.EVIL;
        } else {
            this.side = Side.GOOD;
        }
    }

    public void setSideByPower() {
        int villainPower = 0;
        int superHeroPower = 0;
        for (AbstractHero hero : heroes) {
            if(hero instanceof Villain){
                villainPower += hero.getPower();
            } else if (hero instanceof SuperHero){
                superHeroPower += hero.getPower();
            }
        }
        if (villainPower > superHeroPower){
            this.side = Side.EVIL;
        } else {
            this.side = Side.GOOD;
        }
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
