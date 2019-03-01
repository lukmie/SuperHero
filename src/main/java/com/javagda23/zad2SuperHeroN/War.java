package com.javagda23.zad2SuperHeroN;

import java.util.*;

public class War {
    private Team team1;
    private Team team2;
    private Random random = new Random();

    public War(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

//    public AbstractHero heroFromTeam1() {
//        return team1.getHeroes().get(random.nextInt(team1.getHeroes().size()));
//        return Optional.ofNullable(team1.getHeroes().get(random.nextInt(team1.getHeroes().size())));
//    }

//    public AbstractHero heroFromTeam2() {
//        return team2.getHeroes().get(random.nextInt(team2.getHeroes().size()));
//        return Optional.ofNullable(team2.getHeroes().get(random.nextInt(team2.getHeroes().size())));
//    }

    private void skirmish(){
        AbstractHero abstractHero1 = team1.getHeroes().get(random.nextInt(team1.getHeroes().size()));
        AbstractHero abstractHero2 = team2.getHeroes().get(random.nextInt(team2.getHeroes().size()));
        int power1 = abstractHero1.getPower();
        int power2 = abstractHero2.getPower();


        if (abstractHero1.getName().equals("Priest Of Kamikaze")){
            System.out.println("Zostal wylosowany Priest Of Kamikaze z druzyny " + team1.getType());
            team2.getHeroes().clear();
        }
        if (abstractHero2.getName().equals("Priest Of Kamikaze")){
            System.out.println("Zostal wylosowany Priest Of Kamikaze z druzyny "  + team2.getType());
            team1.getHeroes().clear();
        }

//        if (heroFromTeam1().isPresent() && heroFromTeam2().isPresent()){
            if (power1 > power2) {
                team2.removeHeroFromTeam(abstractHero2);
                System.out.println(abstractHero1.getName() + " z drużyny " + abstractHero1.getTeamType()
                        +  " wygrał pojedynek z " + abstractHero2.getName() + " z drużyny "
                        + abstractHero2.getTeamType());
            } else if (power1 < power2) {
                team1.removeHeroFromTeam(abstractHero1);
                System.out.println(abstractHero2.getName() + " z drużyny " + abstractHero2.getTeamType()
                        +  " wygrał pojedynek z " + abstractHero1.getName() + " z drużyny "
                        + abstractHero1.getTeamType());
            }
//        }
    }

    public void battle(){
        if (team1.getHeroes().size() == team2.getHeroes().size()){
            checkDraw();
        }else {
            do {
                skirmish();
            } while (!team1.getHeroes().isEmpty() && !team1.getHeroes().isEmpty());
            System.out.println(team1.getHeroes().size());
            System.out.println(team2.getHeroes().size());
        }

    }

    private void checkDraw(){
        int licznik = 0;
        Collections.sort(team1.getHeroes(), new Comparator<AbstractHero>() {
            @Override
            public int compare(AbstractHero o1, AbstractHero o2) {
                if (o1.getPower() > o2.getPower())return 1;
                if (o1.getPower() < o2.getPower())return -1;
                return 0;
            }
        });

        Collections.sort(team2.getHeroes(), new Comparator<AbstractHero>() {
            @Override
            public int compare(AbstractHero o1, AbstractHero o2) {
                if (o1.getPower() > o2.getPower())return 1;
                if (o1.getPower() < o2.getPower())return -1;
                return 0;
            }
        });

        for (int i = 0; i < team1.getHeroes().size(); i++) {
            if (team1.getHeroes().get(i) == team2.getHeroes().get(i)){
                licznik++;
            } else break;
            if (licznik == team1.getHeroes().size()) System.out.println("remis");
        }
    }
}
