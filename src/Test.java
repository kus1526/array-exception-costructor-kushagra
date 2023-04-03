package javaproject;
class Testcona
{
	public Testcona() {
		System.out.println("Hi from Constructor Body");
	}
	public Testcona(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
}


public class Test {
	public static void main(String[] args) {
		new Testcona(12,13);
	}

}
