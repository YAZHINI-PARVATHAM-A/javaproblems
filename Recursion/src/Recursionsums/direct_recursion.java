package Recursionsums;



public class direct_recursion {
	public static void fun(int a) {
		if(a>0) {
			fun(a-1);
			System.out.println(a);
			
		}
	}
public static void main(String args[]) {
	int a=3;
	fun(a);
}
}
