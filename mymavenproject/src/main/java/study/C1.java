package study;

public class C1 extends C2 {

	public void display() {
		System.out.println("ho from child");
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		C1 obj=new C1();
		obj.display();
		obj.show();
	}

}
