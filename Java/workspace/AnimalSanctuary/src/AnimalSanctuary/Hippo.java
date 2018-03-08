package AnimalSanctuary;

public class Hippo extends Carnivore{

    public Hippo() {
    }

    public Hippo(String firstName) {
        this.firstName = firstName;
    }
    
    public void makeNoise() {
        System.out.println("\tI also need WeightWatchers and a dentist!");
        System.out.print("\t\tI'm so hungry, and ");
    }
    
    public void eat(int poundsOfFood) {
        makeNoise();
        System.out.println("I ate " + poundsOfFood + " pounds of food.");
    }

}