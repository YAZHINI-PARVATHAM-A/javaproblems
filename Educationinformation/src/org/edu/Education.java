package org.edu;

public class Education extends Arts{
	public void ug() {
		System.out.println("ug in education");
	}
	public void pg() {
		System.out.println("pg in education");
	}
	
	public static void main(String args[]) {
		  Arts obj=new Education();
	  	  obj.ug();
	  	  obj.pg();
	  	  obj.bsc();
	  	  obj.ba();
	  	 
	  }
}
