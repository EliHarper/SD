package AnimalSanctuary;

public class Sanctuary {
    private Animal[] animals = new Animal[4];
    private Attendant attendant;
    private int currentAnimalIndex;
    
    public Sanctuary(Attendant attend) {
        this.attendant = attend;
    }
    
    public Sanctuary(Attendant attend, int count) {
        this.attendant = attend;
        this.currentAnimalIndex = count;
    }
    
    public Sanctuary(Attendant attend, Animal[] anAnimalArray) {
        this.attendant = attend;
        this.animals = anAnimalArray;
    }
    
    public void addAnimal(Animal animalA) {
        currentAnimalIndex = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animalA;
                break;
            }
        }
    }
    
    public void startingRounds() {
        attendant.doRounds(animals);
    }
}
