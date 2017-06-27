package com.nomankhan.designpatternjava.designpatterns.creational.factory;

/**
 * Created by Noman Khan on 28/06/17.
 */

class AnimalFactory {

    public static final String COW = "cow";
    public static final String BUFFALOW = "buffalow";
    public static final String DOG = "dog";

    public static Animal getAnimal(String animalName) {
        switch (animalName) {
            case COW:
                return new Cow();
            case BUFFALOW:
                return new Buffalo();
            case DOG:
                return new Dog();
                default:
                    break;
        }

        return null;
    }

}
