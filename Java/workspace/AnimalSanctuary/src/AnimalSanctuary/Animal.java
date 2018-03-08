package AnimalSanctuary;

public class Animal {
    protected String firstName;

    public Animal() {
    }

    public Animal(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    
    public void eat(int poundsOfFood) {
        makeNoise();
        System.out.println("\t\tI ate " + poundsOfFood + " pounds of food.");
    }
    
    public void makeNoise() {
    }
}