import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class childClassDemo extends parentClassDemo{
	public void audioSystem() {
		System.out.println("audio system from child class");
	}
	float number2 = 2.55f;
	int number = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo c= new childClassDemo();//it will prioritize the attributes in the child class. 
		//System.out.println(weight);
		c.gear();
		c.colorFunction();
		parentClassDemo p = new childClassDemo();//we create an object childClass, but inherit from Parent
		p.guidelines();
		System.out.println(p.number);
		System.out.println(c.number2);
		//System.out.println(number2);
		//c.audioSystem();
		c.audioSystem();
		p.audioSystem();
		
		
		Integer[] numbers = new Integer[] { 1, 2, 3 };//khai bao 1 mang co 10 phan tu 
		List<Integer> list = Arrays.asList(numbers);
		for (int i = 1;i<11;i++) {
			list.add(i);
		}
		
		
		
	}
	public void colorFunction() {
		System.out.println(weight);
	}

}
