
public class FunctionOverloading {
	
	public void getData() {
		System.out.println("Get Data method");
	}
	public void getData(int a) {
		System.out.println("Get the result of a: "+Integer.toString(a));
	}
	public void getData(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading f = new FunctionOverloading();
		f.getData();
		f.getData(5);
		f.getData(1, 2);
	}

}
