package Recursionsums;

public class sumofnatural {
	
	static int sum(int a) {
		if(a>0)
		 return a+sum(a-1);
		else {
		return 0;
	}}
public static void main(String args[]) {
	int a=5;
	int s=sum(a);
	System.out.print(s);
}
}
