public class ZooKeeperBat extends ZooKeeperMammal {

    public ZooKeeperBat(){
        setEnergy(300);
    }


    public ZooKeeperBat fly(){
        System.out.println("Flap, Flap, Flap");
        // System.out.println(getEnergy());

        if(getEnergy() - 50 > 0){
            setEnergy(getEnergy() - 50);
        }else{
            System.out.println("Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }

    public ZooKeeperBat eatHumans(){
        System.out.println("Eating Human............");
        // System.out.println(getEnergy());
        setEnergy(getEnergy() + 25);
        System.out.println("*****Energy level: "+getEnergy());
        return this;
    }

    public ZooKeeperBat attackTown(){
        System.out.println("Ahh...............");
        // System.out.println(getEnergy());

        if(getEnergy() - 100 > 0){
            setEnergy(getEnergy() - 100);
        }else{
            System.out.println("Too Tired...");
        }
        System.out.println("*****Energy level: "+getEnergy());

        return this;
    }
}