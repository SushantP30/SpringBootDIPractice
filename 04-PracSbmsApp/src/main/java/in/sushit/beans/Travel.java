package in.sushit.beans;

public class Travel {
private Vehical vehical;
public Travel(Vehical vehical){
	this.vehical=vehical;
}
public void goForRide() {
	int status=vehical.Start();
	
	if(status>=1) {
		System.out.println("Travling started!!");
		
	}
	else {
		System.out.println("Vehical not found");
	}
}
}
