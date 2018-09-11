public class ZooKeeperMammal {
	private int energy;

	public ZooKeeperMammal(){ // constructor - name must match the class name
		this.energy = 100;
	}

	public int getEnergy(){
		return this.energy;
	}

	public ZooKeeperMammal setEnergy(int val){
		this.energy = val;
		return this;
	}
}