package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<Furbaby>furbaby = new ArrayList<>();
//created an array list for furbaby (my pet)
//        created a scanner method to find the number of pets someone has
        Scanner numPetScanner = new Scanner(System.in);
        System.out.println("How many furbabys do you?");
        int numPet = numPetScanner.nextInt();
// created a for loop to idenitify if a person has more than one pet
// and will repeat the question by however many pets you have
        for (int i=0; i <numPet; i++){
//Created a scanner to id the type of pet they have
            Scanner PetTypeScanner = new Scanner(System.in);
            System.out.println("What kind of pet(s) do you have?");
            String petType = PetTypeScanner.nextLine();
//created a scanner to ask someone the name of their pet
    Scanner FurbabynameScanner = new Scanner(System.in);
            System.out.println("Whats that little furbabys name?!");
            String Furbabyname = FurbabynameScanner.nextLine();
//created a scanner to allow the user to put their pets answers
            Scanner furbabyvoice = new Scanner(System.in);
            System.out.println("Tell yo animal to speak up.");
            String petAnswer = furbabyvoice.nextLine();
//Created multiple methods to identify each pet a person owns and creates an object that extends into fur baby
            //check if user input matches the object.
            if (petType.equalsIgnoreCase("dog")){
                //create object if the user input matches the object class
                Dog dog = new Dog(petType,Furbabyname, petAnswer);
                furbaby.add(dog);
            } else if (petType.equalsIgnoreCase("cat")){
                Cat cat = new Cat(petType,Furbabyname, petAnswer);
                furbaby.add(cat);
            }
            else{
                Parrot newParrot = new Parrot(petType,Furbabyname,petAnswer);
                furbaby.add(newParrot);
            }
            //print out array for furbaby

            System.out.println(furbaby);
        Furbaby.speech(furbaby);

        }

    }

}
