package Recursionsums;

public class indirect {
	public static void fun1(int a) {
		if(a>0) {
			fun2(a-1);
			System.out.println(a);
			
		}
	}
	public static void fun2(int a) {
		if(a>0) {
			fun1(a-1);
			System.out.println(a);
			
		}
	}
public static void main(String args[]) {
	int a=3;
	fun1(a);
}
}
