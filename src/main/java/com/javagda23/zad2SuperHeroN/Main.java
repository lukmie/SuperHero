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
        SuperHero s7 = new SuperHero("g", new HeroStatistics(10111,10,15), TeamType.GREEN);
        SuperHero s8 = new SuperHero("h", new HeroStatistics(10,10,15), TeamType.GREEN);
        Team t1 = new Team(TeamType.RED);
        Team t2 = new Team(TeamType.GREEN);
        System.out.println(v2.getPower());
        System.out.println(v3.getPower());

        try {
            t1.addHeroToTeam(v2);
            t1.addHeroToTeam(v3);
            t2.addHeroToTeam(s7);
//            t2.addHeroToTeam(s8);
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

        t1.setSideByPower();
        System.out.println(t1.getSide());
        System.out.println(s8.toStringParse());

        War w = new War(t1, t2);

        w.battle();

    }
}
