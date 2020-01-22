package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Dog extends Animal {
    private ArrayList<Puppy> puppies = new ArrayList<>();

    public Dog(String name, int age, ArrayList<Puppy> puppies) {
        super(name, age);
        this.puppies = puppies;
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public ArrayList<Puppy> getPuppies() {
        return puppies;
    }

    public void setPuppies(ArrayList<Puppy> puppies) {
        this.puppies = puppies;
    }

    @Override
    public void makeVoice() {
        bark();
    }

    public void bark() {
        System.out.println("Bark, Bark");
    }

    public void giveBirthToOffspring() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5) + 2; i++) {
            Puppy puppy = new Puppy(String.valueOf(i + 1), 0);
            this.puppies.add(puppy);
        }
    }

    public void addPuppy(Puppy puppy) {
        puppies.add(puppy);
    }

    public void printName(int indexOfPuppy) {
        System.out.println(this.puppies.get(indexOfPuppy).getName());
    }
}
