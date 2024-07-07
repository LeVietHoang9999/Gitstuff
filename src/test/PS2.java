package test;

public class PS2 {
	int a; 
	public PS2(int a2) {//this a is the global variable.
		this.a = a2; //"this" keyword
	}
	//The method public PS2(int a2): we call it as "default constructor"
	public int increment() {
		a=a+1;
		return a;
	}
	public int decrement() {
		a = a-1;
		return a; 
	}
}
