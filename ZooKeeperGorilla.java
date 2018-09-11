public class ZooKeeperGorilla extends ZooKeeperMammal {
    public ZooKeeperGorilla(String name){
        setName(name);
    }

    public ZooKeeperGorilla throwThings(){
        System.out.println(getName()+" is Throwing Stuff");
        // System.out.println(getEnergy());

        if(getEnergy() - 5 > 0){
            setEnergy(getEnergy() - 5);
        }else{
            System.out.println(getName()+" is Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }

    public ZooKeeperGorilla eatBanana(){
        System.out.println(getName()+" is Eating A Banana...");
        // System.out.println(getEnergy());
        setEnergy(getEnergy() + 10);
        System.out.println("*****Energy level: "+getEnergy());
        return this;
    }

    public ZooKeeperGorilla climb(){
        System.out.println(getName()+" is Climbing Stuff...");
        // System.out.println(getEnergy());

        if(getEnergy() - 10 > 0){
            setEnergy(getEnergy() - 10);
        }else{
            System.out.println(getName()+" is Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }
}