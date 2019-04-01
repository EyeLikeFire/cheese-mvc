package org.launchcode.models;

import java.util.ArrayList;

public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    //get all
    public static ArrayList<Cheese> getAll(){
        return cheeses;
    }
    //add
    public static void add (Cheese newCheese){
        cheeses.add(newCheese);
    }
    //remove
    public static void remove(int id){
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }
    //get by id
    public static Cheese getById(int id){
        Cheese matchingCheese;
        for(Cheese searchCheese : cheeses){
            if (searchCheese.getCheeseId() == id){
                matchingCheese = searchCheese;
                return searchCheese;
            }
        }

        return null;
    }

}
