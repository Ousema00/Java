package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 3, true);
        Aquatic whale= new Aquatic();
        Terrestial camel=new Terrestial();
        Penguin p1 = new Penguin();
        Dolphin d1 = new Dolphin();

        Zoo myZoo = new Zoo("My Zoo", "Tunis");
        whale.swim();
        p1.swim();
        d1.swim();
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        myZoo.displayAnimals();
        System.out.println(myZoo);
    }
}
