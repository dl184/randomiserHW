package models;

import java.util.ArrayList;
import java.util.Collections;

public class Randomiser {

    private ArrayList<String> names;


    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public Randomiser() {

        names.add("Derek");
        names.add("Adri");
        names.add("Jack");
        names.add("Roddy");
        names.add("Pete");
        names.add("Cleyra");
        names.add("Tara");
        names.add("Campbell");
        names.add("Stevie");
        names.add("Richard");
        names.add("Greg");
        names.add("Stephan");
        names.add("Angelina");
        names.add("Matt");
        names.add("Craig");
        names.add("Joe");
        names.add("Debi");
        names.add("Farheen");
        names.add("Harjit");
    }


    public ArrayList<String> getNames() {
        return names;
        }

        /* Below we pass in the array list of names and used the collections.shuffle method, we assign "name to the
           result and use .get(0) to get the first name out that shuffled array */
        public String assignARandomName(){
        Collections.shuffle(names);
        String name = names.get(0);
        return name;
    }

    public ArrayList<String> listRandomNames(int num){
        ArrayList<String> names = new ArrayList<>();
        Collections.shuffle(names);

        for(int i =0; i < num; i++) {

            String name = names.get(i);
            names.add(name);
        }
        return names;
    }
}