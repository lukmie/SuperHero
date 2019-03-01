package com.javagda23.zad2SuperHeroN;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 133, 2, 87, 45, 645, 345, 324, 28, 896));
        List<Integer> listB = new ArrayList<>(Arrays.asList(1, 2, 221, 223, 11, 23, 123, 12, 876, 345 ,13, 2));

        Random random = new Random();
        Integer a;
        Integer b;
        int licznik = 0;
        {
            Collections.sort(listA);
            Collections.sort(listB);
            for (int i = 0; i < listA.size(); i++) {
                if (listA.get(i) == listB.get(i)){
                    licznik++;
                } else break;
                if (licznik == listA.size()) System.out.println("remis");
            }
        }

        do{
            a = listA.get(random.nextInt(listA.size()));
            b = listB.get(random.nextInt(listB.size()));
            System.out.println("wylosowany a: " + a);
            System.out.println("wylosowany b: " + b);
            if (a.equals(13)){
                System.out.println("Zostal wylosowany 13 z druzyny A");
                listB.clear();
            }
            if (b.equals(13)){
                System.out.println("Zostal wylosowany 13 z druzyny B");
                listA.clear();
            }
            if (a > b) {
                listB.remove(b);
                System.out.println(a + " z drużyny A wygrał pojedynek z " + b + " z drużyny B");
            } else if (a < b) {
                listA.remove(a);
                System.out.println(b + " z drużyny B wygrał pojedynek z " + a + " z drużyny A");
            }
        } while (!listA.isEmpty() && !listB.isEmpty());
        System.out.println(listA);
        System.out.println(listB);

        System.out.println(listA.isEmpty() ? "Druzyna B wygrala!" : "Druzyna A wygrala!");



















//        int i = 0;
//        while (!listA.isEmpty() && !listB.isEmpty()) {
//            if (listA.get(i).equals(listB.get(i))) {
//                i++;
//                if (listA.get(i) < listB.get(i)) {
//                    listA.remove(listA.get(i));
//                    i = 0;
//                } else if (listA.get(i) > listB.get(i)) {
//                    listB.remove(listB.get(i));
//                    i = 0;
//                }
//            }
//        }
//        System.out.println("List a " + listA.size());
//        System.out.println("List b " + listB.size());
//
//        if (listA.isEmpty()) System.out.println("List B won!");
//        else System.out.println("List A won!");
//
//        System.out.println(listA.isEmpty() ? "List B won!" : "List A won!");

    }
}
