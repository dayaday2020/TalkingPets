package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Furbaby {
    public String petType;
    public String Speak;
    private String Name;

    public Furbaby(String petType, String name, String Speak){
        this.Name= name;
        this.petType= petType;
        this.Speak= Speak;
    }
    public String getName(){
        return this.Name;
    }
public void setName(String name){
        this.Name=name;

    }

    @Override
    public String toString() {
        return "Furbaby{" +
                "petType='" + petType + '\'' +
                ", Speak='" + Speak + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    public static void speech(ArrayList<Furbaby> pets) {
        for (Furbaby furbaby : pets) {
            System.out.println(furbaby.Speak);


        }

    }
}
