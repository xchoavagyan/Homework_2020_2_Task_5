package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	5 Create class Dog using classes, Animal and Puppy (max age for puppy is 1 year)

methods
	printName()
	bark()
	giveBirthToOffspring() - (ծնել 1  ից ավել 7 ից պակաս random քանակի ձագուկներ)


	 */
        Puppy puppy1 = new Puppy("Roni", 0);
        Dog dog = new Dog("Elada", 3);
        dog.addPuppy(puppy1);
        dog.giveBirthToOffspring();
        for (int i = 0; i < dog.getPuppies().size(); i++) {
            dog.printName(i);
        }
        dog.bark();
        dog.makeVoice();
    }
}
