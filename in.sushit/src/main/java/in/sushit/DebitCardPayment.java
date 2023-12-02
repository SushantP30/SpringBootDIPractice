package in.sushit;

public class DebitCardPayment implements IPayment{
	 public DebitCardPayment() {
		  System.out.println("DebitCardPayment::Constructor");
	  }
	@Override
	public boolean ProcessPayment(int billAmount) {
		System.out.println("Payment done using DebitCard Amount diducted="+billAmount);
		return true;
		
	}

}
