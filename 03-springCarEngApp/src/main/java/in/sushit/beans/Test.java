package in.sushit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context =new ClassPathXmlApplicationContext("spring-beans.xml");
		  Car car=context.getBean(Car.class);
		  car.drive();
		  
	}

}
