package _b7_abstract_interface.practice.animal_and_interfaceedible.animal;

import _b7_abstract_interface.practice.animal_and_interfaceedible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
