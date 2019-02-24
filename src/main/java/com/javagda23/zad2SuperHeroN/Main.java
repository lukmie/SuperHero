package com.javagda23.zad2SuperHeroN;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        AbstractHero villain1 = HeroCreator.createVillainWithDefaultStats();
////        AbstractHero villain1 = HeroCreator.createVillain();
//        AbstractHero superHero1 = HeroCreator.createSuperHeroWithDefaultStats();
//
//        System.out.println(villain1.getHeroStatistics());
//        System.out.println(superHero1.getHeroStatistics());

        Villain v2 = new Villain("a", new HeroStatistics(10,10,15), TeamType.RED);
        Villain v3 = new Villain("b", new HeroStatistics(10,10,15), TeamType.RED);
        Villain v4 = new Villain("c", new HeroStatistics(20,20,15), TeamType.RED);
        Villain v5 = new Villain("e", new HeroStatistics(10,10,15), TeamType.RED);
        Villain v6 = new Villain("f", new HeroStatistics(10,10,15), TeamType.RED);
        SuperHero s7 = new SuperHero("g", new HeroStatistics(10,10,15), TeamType.RED);
        SuperHero s8 = new SuperHero("g", new HeroStatistics(10,10,15), TeamType.GREEN);
        Team t1 = new Team(TeamType.RED);
        Team t2 = new Team(TeamType.GREEN);
        System.out.println(v2.getPower());
        System.out.println(v3.getPower());
        System.out.println(v4.getPower());
        System.out.println(v5.getPower());
        System.out.println(v6.getPower());

        try {
            t1.addHeroToTeam(v2);
            t1.addHeroToTeam(v3);
            t1.addHeroToTeam(v4);
            t1.addHeroToTeam(v5);
            t1.addHeroToTeam(v6);
            t1.addHeroToTeam(s7);
            t1.addHeroToTeam(s8);
        } catch (InvalidHeroTeamException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getTeamLeader());
        System.out.println(t1.getTeamPower());

        System.out.println("before " + s7.getHeroStatistics().getDefence());
//        t1.buffTeamPower();
        System.out.println(t1.getTeamPower());
        System.out.println("after " + s7.getHeroStatistics().getDefence());
//        t1.buffTeamPower();
        System.out.println("after 2nd buff " + s7.getHeroStatistics().getDefence());


        System.out.println("############");
        System.out.println(TeamUtils.compare(t1, t2));
        System.out.println("###");
        System.out.println(TeamUtils.compareAfterBuff(t1, t2));
    }
}
