package AnimalSanctuary;

public class Lion extends Carnivore{

    public Lion() {
    }

    public Lion(String firstName) {
        this.firstName = firstName;
    }
    
    public void makeNoise() {
        System.out.println("\tI need a barber!");
    }

}