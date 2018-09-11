public class ZooKeeperGorilla extends ZooKeeperMammal {
    public ZooKeeperGorilla(){

    }

    public ZooKeeperGorilla throwThings(){
        System.out.println("Throwing Stuff");
        // System.out.println(getEnergy());

        if(getEnergy() - 5 > 0){
            setEnergy(getEnergy() - 5);
        }else{
            System.out.println("Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }

    public ZooKeeperGorilla eatBanana(){
        System.out.println("Eating A Banana...");
        // System.out.println(getEnergy());
        setEnergy(getEnergy() + 10);
        System.out.println("*****Energy level: "+getEnergy());
        return this;
    }

    public ZooKeeperGorilla climb(){
        System.out.println("Climbing Stuff...");
        // System.out.println(getEnergy());

        if(getEnergy() - 10 > 0){
            setEnergy(getEnergy() - 10);
        }else{
            System.out.println("Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }
}