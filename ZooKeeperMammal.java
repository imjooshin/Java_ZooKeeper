public class ZooKeeperMammal {
	private String name;
	private int energy;

	public ZooKeeperMammal(){ // constructor - name must match the class name
		this.energy = 100;
	}

	public int getEnergy(){
		return this.energy;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public ZooKeeperMammal setEnergy(int val){
		this.energy = val;
		return this;
	}
}