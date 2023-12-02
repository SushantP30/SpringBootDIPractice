package in.sushit;

public class UPIPayment implements IPayment{
	 public UPIPayment() {
		  System.out.println("CreditCardPayment::Constructor");
	  }
	@Override
	public boolean ProcessPayment(int billAmount) {
		// TODO Auto-generated method stub
		System.out.println("Payment done using UPI Amount diduct ="+billAmount);
		return true;
	}

}
