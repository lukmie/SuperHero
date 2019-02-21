package com.javagda23.zad2SuperHeroN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
@Data
@AllArgsConstructor
public class HeroStatistics {
    private int health;
    private int attack;
    private int defence;

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public void increaseHealth(int amount){
        this.health += amount;
    }

    public void increaseAttack(int amount){
        this.attack += amount;
    }

    public void increaseDefence(int amount){
        this.defence += amount;
    }

}
