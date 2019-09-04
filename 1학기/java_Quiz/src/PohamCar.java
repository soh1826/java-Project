
public class PohamCar {
	String ownerName, carColor, turnShow;
	PohamHandle handle;
	
	public PohamCar() {
	}
	
	public PohamCar(String name, String carColor) {
		this.carColor=carColor;
		this.ownerName=name;
		handle = new PohamHandle();
	}
	
	public void turnHandle(int q) {
		turnShow=handle.speedup(q);//turnShow= "과속"
	}
	
}