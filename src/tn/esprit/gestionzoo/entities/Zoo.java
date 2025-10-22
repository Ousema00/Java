package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name); // vérification via setter
        this.city = city;
    }

    // Getter / Setter name avec validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide !");
            this.name = "Zoo par défaut";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // addAnimal en utilisant isZooFull()
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein, impossible d’ajouter " + animal.getName());
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("L’animal " + animal.getName() + " existe déjà !");
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }


    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        int i = 0;
        while (i < aquaticAnimals.length) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            } else {
                i++;
            }
        }
        if (i == aquaticAnimals.length) {
            System.out.println("La aquatic animal est plein");

        }
    }

    public void makeAquaticAnimalsSwim() {
        System.out.println("=== Les animaux aquatiques nagent ===");
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] != null) {
                aquaticAnimals[i].swim(); // appel dynamique (polymorphisme)
            }
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxPenguinSwimmingDepth = 0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if( aquaticAnimals[i] instanceof Penguin && ((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxPenguinSwimmingDepth ){
                maxPenguinSwimmingDepth=((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return maxPenguinSwimmingDepth;

    }

    public void displayNumberOfAquaticsByType(){
        int dph=0;
        int pg=0;
        for(int i=0;i< animals.length;i++){
            if(animals[i].getClass()==Penguin.class ){
                ++pg;
            }
            else if(animals[i].getClass()== Dolphin.class){
                ++dph;
            }
        }
        System.out.println("le nombre de penguin dans ce zoo est"+pg);
        System.out.println("le nombre de dauphin dans ce zoo est "+dph);
    }

}


