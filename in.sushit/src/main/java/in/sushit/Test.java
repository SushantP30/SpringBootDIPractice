package in.sushit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context =new ClassPathXmlApplicationContext("spring-beans.xml");
      Payment pay =context.getBean(Payment.class);
      pay.do_Payment(200);
	}

}
