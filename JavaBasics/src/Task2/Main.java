package Task2;

class Add{
	void add(int a,int b) {
		
		System.out.println(a+b);
	}
	void add(int a,int b,int c ) {
		System.out.println(a+b+c);
	}
void add(double a,double b) {
		
		System.out.println(a+b);
	}
}
public class Main {
public static void main(String args[]) {
	Add obj=new Add();
	obj.add(1, 2);
	obj.add(3, 4,5);
	obj.add(1.3, 1.4);
}
}
