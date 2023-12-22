package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();

		pq.add(900);
		pq.add(600);
		pq.add(400);
		pq.add(200);
		pq.add(100);

		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		List<Integer> l= new ArrayList<>();
		for(int i=pq.size()-1;i>=0;i--) {
			
			l.add(pq.poll());
		}
		
		pq.offer(700);
		System.out.println(pq);
		Queue<Integer> q = new PriorityQueue<>();

	System.out.println(q);
	}

}
