package _b7_abstract_interface.practice.animal_and_interfaceedible;

import _b7_abstract_interface.practice.animal_and_interfaceedible.animal.Animal;
import _b7_abstract_interface.practice.animal_and_interfaceedible.animal.Chicken;
import _b7_abstract_interface.practice.animal_and_interfaceedible.animal.Tiger;
import _b7_abstract_interface.practice.animal_and_interfaceedible.edible.Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
