package Recursionsums;

public class factorial {
	public static int fact(int a) {
		if(a==0)
			return 1;
		return a*fact(a-1);
	}
public static void main(String args[]) {
	int a=5;
	int f=fact(a);
	System.out.print(f);
}
}
