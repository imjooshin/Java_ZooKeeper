public class ZooKeeperTest {
    public static void main(String[] args){
        // ZooKeeperMammal animal = new ZooKeeperMammal();
        ZooKeeperGorilla gorilla = new ZooKeeperGorilla("Gorrrr");
        ZooKeeperBat vampireBat = new ZooKeeperBat("Stingy");

        // System.out.println(animal.getEnergy());
        // animal.setEnergy(190);
        // System.out.println(animal.getEnergy());
        // animal.setEnergy(200).setEnergy(500);
        // System.out.println(animal.getEnergy());
        System.out.println(gorilla.getName());

        gorilla.throwThings().throwThings().throwThings().eatBanana().eatBanana().climb();

        System.out.println(vampireBat.getName());
        
        System.out.println("Bat Energy: "+vampireBat.getEnergy());
        vampireBat.fly().fly().eatHumans().eatHumans().attackTown().attackTown().attackTown();
    }
}