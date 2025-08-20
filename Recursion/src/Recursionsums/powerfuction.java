package Recursionsums;

public class powerfuction {
	static int power(int a , int p) {
		if(p==0)
			return 1;
		else {
			return a*power(a,p-1);
		}
		
		
		
	}
public static void main(String args[]) {
	int a=2;
	int p=3;
	int val=power(a,p);
	System.out.print(val);
}
}
