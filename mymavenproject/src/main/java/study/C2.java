package study;

public class C2 extends Factorial {
	
	public void show() {
		System.out.println("Hello from child");
	}
public static void main(String args[]) {
	C2 obj=new C2();
	obj.show();
	obj.fact();
}
}
