package org.collection;
import java.util.*;
public class stackcollection {
public static void main(String args[]) {
	Stack<Integer> s = new Stack<>();
	s.push(3);
	s.push(4);
	s.push(6);
	s.push(7);
	System.out.println("After insertion");
	System.out.println(s);
	s.pop();
	System.out.println("After pop operation");
	System.out.println(s);
	
	System.out.println("After peek operation");
	System.out.println(s.peek());
	System.out.println(s.search(4));
}
}
