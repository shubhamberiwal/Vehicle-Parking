package packagepark;


class Car extends Parking {
	int car;
	Car(){
		car=0;
	}
	Car(int car, int slots){
		super(slots);
		this.car = car;
	}
	public void setcar(int car) {
		this.car = car;
	}
	public int getcar() {
		return car;
	}
}
