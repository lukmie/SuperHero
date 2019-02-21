package com.javagda23.zad2SuperHeroN;

import java.io.*;

public abstract class HeroCreator {
    public static AbstractHero createSuperHero(){
        return new SuperHero("Jack", new HeroStatistics(60,70,65), TeamType.RED);
    }

    public static AbstractHero createVillain(){
        return new Villain("John", new HeroStatistics(10,10,10), TeamType.BLUE);
    }

    public static AbstractHero createSuperHeroWithDefaultStats(){

        int health = 0;
        int attack = 0;
        int defence = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("applicationProperties.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if(line.equals("SuperHero")){
                    line = bufferedReader.readLine();
                    health = Integer.parseInt(line.split("=")[1]);

                    line = bufferedReader.readLine();
                    attack = Integer.parseInt(line.split("=")[1]);

                    line = bufferedReader.readLine();
                    defence = Integer.parseInt(line.split("=")[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new SuperHero("Jerry", new HeroStatistics(health, attack, defence), TeamType.GREEN);
    }

    public static AbstractHero createVillainWithDefaultStats(){


        int health = 0;
        int attack = 0;
        int defence = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("applicationProperties.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if(line.equals("Villain")){
                    line = bufferedReader.readLine();
                    health = Integer.parseInt(line.split("=")[1]);

                    line = bufferedReader.readLine();
                    attack = Integer.parseInt(line.split("=")[1]);

                    line = bufferedReader.readLine();
                    defence = Integer.parseInt(line.split("=")[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Villain("Tom", new HeroStatistics(health, attack, defence), TeamType.BLUE);

    }

}
