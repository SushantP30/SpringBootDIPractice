package in.sushit;

public class SodekuPayment implements IPayment{
	 public SodekuPayment() {
		  System.out.println("SodekuPayment::Constructor");
	  }
	@Override
	public boolean ProcessPayment(int billAmount) {
		// TODO Auto-generated method stub
		System.out.println("Payment done using sodeku card amount didcuted is ="+billAmount);
		return true;
		
	}

}
