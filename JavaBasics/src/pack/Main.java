package pack;

class Hello{
	void display() {
		
		System.out.print("Hello ");
	}
}
class Friend extends Hello{
	void display1() {
		System.out.print("Friend");
	}
}
public class Main{
public static void main(String args[]) {
	Friend obj=new Friend();
	obj.display();
	obj.display1();
	
}
}
