package Taylorseriespack;

public class TaylarSeries {
static double factorial(int n) {
	if(n==0)
		return 1;
	return n*factorial(n-1);
}
static double power(double x,int n) {
	if(n==0) return 1;
	return x*power(x,n-1);
}
static double taylorExp(double x,int n) {
	if(n==0)
		return 1;
	return(power(x,n)/factorial(n))+taylorExp(x,n-1);
}
public static void main(String args[]) {
	int n=15;
	double x=8.0;

	double series=taylorExp(x,n);
	System.out.print(series);
}
}
