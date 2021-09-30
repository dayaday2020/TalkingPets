package io.zipcoder.polymorphism;

import java.util.ArrayList;

public abstract class Furbaby {
    public String petType;
    public String Speak;
    private String Name;
//Created multiple constructors for pet object
    public Furbaby(String petType, String name, String Speak) {
        this.Name = name;
        this.petType = petType;
        this.Speak = Speak;
        //created instances for furbaby
    }
//made a setter and getter for name lines 16-24
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;

    }
//Used toString method to print out the inf0ration in the array list line 26-33
    @Override
    public String toString() {
        return "Furbaby{" +
                "petType='" + petType + '\'' +
                ", Speak='" + Speak + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    //printing what the animal in the array list is saying
    public static void speech(ArrayList<Furbaby> pets) {
        for (Furbaby furbaby : pets) {
            System.out.println(furbaby.Speak);


        }     }
    }

