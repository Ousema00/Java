package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;




    @Override
    public String toString(){
        return super.toString() + "habitat: " + habitat;
    }

    public abstract void swim();
}


