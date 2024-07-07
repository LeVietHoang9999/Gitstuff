
public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.bodyAircraftColor();
		c.engine();
		c.safetyGuidelines();
	}

	@Override
	public void bodyAircraftColor() {
		// TODO Auto-generated method stub
		System.out.println("The color of the Emirates Aircrafts is red & white");
	}

}
