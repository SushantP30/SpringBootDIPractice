package in.sushit.beans;

public class Bike implements Vehical {
	public Bike() {
		System.out.println("Bike::Constructor");
	}

	@Override
	public int Start() {
		// TODO Auto-generated method stub
		System.out.println("We have started Traveling with Bike!!");
		return 1;
	}

}
