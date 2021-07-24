package packagepark;

//import packonlypark.Parking;
//import Parking

// Interface
interface occupancy{  
void setoccupied(int occupied);  
}

class Parking implements occupancy{
	protected int slots;
	public int occupied;
	Parking(){
		slots=0;
		occupied = 0;
	}
	Parking(int slots){
		this.slots = slots;
		occupied = 0;
	}
	public void setoccupied(int occupied) {
		this.occupied = occupied;
	}
}

// Inheritance
//class Car extends {
//	int car;
//	Car(){
//		car=0;
//	}
//	Car(int car, int slots){
//		super(slots);
//		this.car = car;
//	}
//	public void setcar(int car) {
//		this.car = car;
//	}
//	public int getcar() {
//		return car;
//	}
//}

// Inheritance instance 2
class Bike extends Parking{
	int bike;
	Bike(){
		bike=0;
	}
	Bike(int bike, int slots){
		super(slots);
		this.bike = bike;
	}
	public void setbike(int bike) {
		this.bike = bike;
	}
	public int getbike() {
		return bike;
	}
}

// Inherited class 3
class Autorick extends Parking{
	int autorick;
	Autorick(){
		autorick=0;
	}
	Autorick(int autorick, int slots){
		super(slots);
		this.autorick = autorick;
	}
	public void setauto(int autorick) {
		this.autorick = autorick;
	}
	public int getauto() {
		return autorick;
	}
}