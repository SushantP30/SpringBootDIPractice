package in.sushit.beans;

public class DisalEngine implements IEngine{
	public DisalEngine() {
		System.out.println("DisalEngine::Constructor");
	}
	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("DisalEngine started!!");
		return 1;
	}

}
