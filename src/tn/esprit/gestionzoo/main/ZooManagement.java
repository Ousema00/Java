package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 3, true);
        Aquatic d2 = new Dolphin("gtyg","hgtt",5,true,"gyff",50);
        Terrestial camel=new Terrestial();
        Dolphin d4=(Dolphin)d2;
        Dolphin d3 = new Dolphin("frm","hgtt",5,true,"gyff",50);
        Penguin p1 = new Penguin();
        Dolphin d1 = new Dolphin();

        Zoo myZoo = new Zoo("My Zoo", "Tunis");
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d4);
        myZoo.addAquaticAnimal(d3);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
        myZoo.makeAquaticAnimalsSwim();
        myZoo.displayAnimals();
        System.out.println(myZoo);
    }
}
