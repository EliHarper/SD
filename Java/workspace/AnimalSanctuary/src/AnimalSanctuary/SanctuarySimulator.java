package AnimalSanctuary;

public class SanctuarySimulator {
    private Attendant attendant;
    private Sanctuary sanc;
    
    public static void main(String[] args) {
        SanctuarySimulator simulator = new SanctuarySimulator();
        simulator.run();
    }
    
    private void run() {
        attendant = new Attendant();
        sanc = new Sanctuary(attendant);
        Giraffe dolly = new Giraffe("Dolly the Giraffe");
        Lion cecil = new Lion("Cecil the Lion");
        Elephant mortimer = new Elephant("Mortimer the Elephant");
        Hippo harry = new Hippo("Harry the Hippo");
        
        sanc.addAnimal(dolly);
        sanc.addAnimal(cecil);
        sanc.addAnimal(mortimer);
        sanc.addAnimal(harry);
        
        sanc.startingRounds();
    }
    
}