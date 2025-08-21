package org.automobile;
import java.util.*;
public class Automobile {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of the vehicle: ");
	int v=sc.nextInt();
	System.out.print("Enter the number of the wheels: ");
	int w=sc.nextInt();
	 if (w % 2 != 0 || v <= 0 || w < 2 * v || w > 4 * v) {
         System.out.println("INVALID INPUT");
         return;
     }
	int f=(w-(2*v))/2;
	int t=v-f;
	if(v>0&&w>=2&&(w%2==0)&&w>v) {
	if(((2*t)+(4*f)==w)&&(f+t==v)&&f>0&&t>0) {
		System.out.print("Four wheeler "+f+" "+"Two wheeler "+t);
	}}
}
}
