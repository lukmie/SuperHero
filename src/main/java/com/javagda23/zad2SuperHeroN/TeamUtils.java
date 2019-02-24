package com.javagda23.zad2SuperHeroN;


public class TeamUtils  {

    public static boolean compare(Team t1, Team t2) {
        if (t1.getTeamPower() > t2.getTeamPower()) {
            return true;
        } else return false;
    }
}
