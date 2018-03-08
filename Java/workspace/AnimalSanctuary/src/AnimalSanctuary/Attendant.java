package AnimalSanctuary;

public class Attendant {
    public Attendant() {
    }

    public void feedAnimal(Animal heresAnAnimal, int food) {
        System.out.print("I am feeding " + heresAnAnimal.getFirstName() + " " + food + " pounds of ");
        if (heresAnAnimal.firstName.equals("Cecil the Lion") || heresAnAnimal.firstName.equals("Harry the Hippo")) {
            System.out.println("meat.");
        }
        else {
            System.out.println("plants.");
        }
        heresAnAnimal.eat(food);
    }
    
    public void doRounds(Animal[] animalArray) {
        for (int i = 0; i < animalArray.length; i++) {
            if (animalArray[i].firstName.equals("Cecil the Lion") || animalArray[i].firstName.equals("Dolly the Giraffe")) {
                feedAnimal(animalArray[i], 10);
            }
            else {
                feedAnimal(animalArray[i], 40);
            }
        }
    }
}