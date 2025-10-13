package tn.esprit.gestionzoo.entities;

public class Terrestial extends Animal{
    protected int nbrLegs;

    public Terrestial(){};
    public  Terrestial(String name,String family,int age,int nbrLegs,boolean isMammal) {
        super(name,family,age,isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
   public String toString(){
    return super.toString() + "nbrlegs:"+ nbrLegs;
}
}
