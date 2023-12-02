package in.sushit.beans;

public class Bus implements Vehical{
	public Bus() {
		System.out.println("Bus::Constructor");
	}

	@Override
	public int Start() {
		// TODO Auto-generated method stub
		System.out.println("Traveling using Bus!!");
		return 1;
	}

}
