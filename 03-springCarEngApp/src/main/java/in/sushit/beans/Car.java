package in.sushit.beans;

public class Car {
 IEngine eng ;
public Car() {
	System.out.println("Car::Constructor");
}

public Car(IEngine eng) {
	this.eng=eng;
}
public void drive() {
	
	int status=eng.start();
	if(status>=1) {
	System.out.println("Engine started!!");	
	}
	else {
		System.out.println("Engine failed!!");
	}
}
}
