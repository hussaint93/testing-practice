package testing;

public class calculator {
	public static int add(int a , int b) {
		return a+b;
	}
	public static float add(float a , float b) {
		if(a>2) {
			System.out.println("some message");
		}
		return a+b;
	}
	public static float divide(int a, int b) {
		return a/b;
	}
}
