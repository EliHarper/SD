package AnimalSanctuary;

public class Elephant extends Herbivore{

    public Elephant() {
    }

    public Elephant(String firstName) {
        this.firstName = firstName;
    }
    
    public void makeNoise() {
        System.out.println("\tI need WeightWatchers!");
    }
    
    public void eat(int poundsOfFood) {
        makeNoise();
        System.out.println("\t\tI ate " + poundsOfFood + " pounds of food.");
        System.out.println("\tThat's a lot of the food!");
    }

}