package in.sushit;

public class Payment {
IPayment payment;
public Payment() {
	System.out.println("Default::Constructor");
}
public  Payment(IPayment payment) {
	this.payment=payment;
	
}

public void do_Payment(int amount) {
	boolean status=payment.ProcessPayment(amount);
	if (status) {
		System.out.println("Payment done...");
	}
	else {
		System.out.println("Payment failed!!");
	}
	
}
}
