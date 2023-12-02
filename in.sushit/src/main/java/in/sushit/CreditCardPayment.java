package in.sushit;

public class CreditCardPayment implements IPayment{
  public CreditCardPayment() {
	  System.out.println("CreditCardPayment::Constructor");
  }
	@Override
	public boolean ProcessPayment(int billAmount) {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Credit card amount diducted="+billAmount);
		return true;
		
	}

}
