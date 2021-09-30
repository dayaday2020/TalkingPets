package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<Furbaby>furbaby = new ArrayList<Furbaby>();

        Scanner numPetScanner = new Scanner(System.in);
        System.out.println("How many furbabys do you?");
        int numPet = numPetScanner.nextInt();

        for (int i=0; i <numPet; i++){

            Scanner PetTypeScanner = new Scanner(System.in);
            System.out.println("What kind of pet(s) do you have?");
            String petType = PetTypeScanner.nextLine();

    Scanner FurbabynameScanner = new Scanner(System.in);
            System.out.println("Whats that little furbabys name?!");
            String Furbabyname = FurbabynameScanner.nextLine();

            Scanner furbabyvoice = new Scanner(System.in);
            System.out.println("Tell yo animal to speak up.");
            String petAnswer = furbabyvoice.nextLine();

            if (petType.equalsIgnoreCase("dog")){
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
            System.out.println(furbaby);
        Furbaby.speech(furbaby);

        }

    }

}
