package AnimalSanctuary;

public class Giraffe extends Herbivore{

    public Giraffe() {
    }

    public Giraffe(String firstName) {
        this.firstName = firstName;
    }
    
    public void makeNoise() {
        System.out.println("\tI have a long neck!");
    }

}