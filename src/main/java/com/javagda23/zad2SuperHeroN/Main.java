package com.javagda23.zad2SuperHeroN;

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
        SuperHero v7 = new SuperHero("g", new HeroStatistics(10,10,15), TeamType.RED);
        Team t1 = new Team(TeamType.RED);
        System.out.println(v2.getPower());
        System.out.println(v3.getPower());
        System.out.println(v4.getPower());
        System.out.println(v5.getPower());
        System.out.println(v6.getPower());
        System.out.println(t1.addHeroToTeam(v2));
        System.out.println(t1.addHeroToTeam(v3));
        System.out.println(t1.addHeroToTeam(v4));
        System.out.println(t1.addHeroToTeam(v5));
        System.out.println(t1.addHeroToTeam(v6));
        System.out.println(t1.addHeroToTeam(v7));

        System.out.println(t1.getTeamLeader());
        System.out.println(t1.getTeamPower());

        System.out.println("before " + v7.getHeroStatistics().getDefence());
        t1.buffTeamPower();
        System.out.println(t1.getTeamPower());
        System.out.println("after " + v7.getHeroStatistics().getDefence());
    }
}
