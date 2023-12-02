package in.sushit.beans;

public class Car implements Vehical {
    public Car() {
    	System.out.println("Car::Constructor");
    }
	@Override
	public int Start() {
		// TODO Auto-generated method stub
		System.out.println("We have started Journy using Bus!!");
		return 1;
	}

}
