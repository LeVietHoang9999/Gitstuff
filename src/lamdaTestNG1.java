
public class lamdaTestNG1 implements CentralWorldTraffic, ContinentalTraffic{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lamdaTestNG1 l = new lamdaTestNG1();
		l.australiaRules();
		l.greenGo();
		l.redStop();
		CentralWorldTraffic c =new lamdaTestNG1();
		c.yellowSlow();
		ContinentalTraffic c2 = new lamdaTestNG1();
		c2.waitTheKangaroo();
	
	}
	

	@Override
	public void waitTheKangaroo() {
		// TODO Auto-generated method stub
		System.out.println("Jump Jump");
	}

	@Override
	public void yellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("Slow down");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go");
	}
	public void australiaRules() {
		System.out.println("inhale the oxygen and take a walk on the glass");
	}
}
