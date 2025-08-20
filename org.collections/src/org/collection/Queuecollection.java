package org.collection;
import java.util.*;
public class Queuecollection {
public static void main(String args[]) {
	
	//this is based on the LinkedList<>()
	Queue<Integer> q1=new LinkedList<>();
	q1.add(2);
	q1.add(50);
	q1.add(15);
	System.out.print(q1);
	Queue<Integer> q=new PriorityQueue<>();
	q.add(2);
	q.add(50);
	q.add(15);
	System.out.print(q);
}
}
