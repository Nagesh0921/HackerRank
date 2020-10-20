//package com.stacks;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class EqualStack {
	public static void main(String[] args) {
		List<Integer> h1 = new ArrayList<>();
		h1.add(1);h1.add(1);h1.add(1);h1.add(2);h1.add(3);
//		Collections.reverse(h1);
		List<Integer> h2 = new ArrayList<>();
		h2.add(2);h2.add(3);h2.add(4);
		List<Integer> h3 = new ArrayList<>();
		h3.add(1);h3.add(4);h3.add(1);h3.add(1);
		System.out.print(new EqualStack().equalsStack(h1, h2, h3));
	}
	public int equalsStack(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
		Stack<Node1> t1 = new Stack<>();
		Stack<Node1> t2 = new Stack<>();
		Stack<Node1> t3 = new Stack<>();
		for (Integer i : h1) {
			if (!t1.isEmpty()) {
				t1.push(new Node1(i, t1.peek().totalValue+i));
			} else {
				t1.push(new Node1(i,i));
			}
		}
		for (Integer j : h2) {
			if (!t2.isEmpty()) {
				t2.push(new Node1(j, t2.peek().totalValue+j));
			} else {
				t2.push(new Node1(j,j));
			}
		}
		for (Integer i : h3) {
			if (!t3.isEmpty()) {
				t3.push(new Node1(i, t3.peek().totalValue+i));
			} else {
				t3.push(new Node1(i,i));
			}
		}
		while(true) {
			if (t1.isEmpty() || t2.isEmpty() || t3.isEmpty()) {
				return 0;
			}
			if (t1.peek().totalValue == t2.peek().totalValue && t2.peek().totalValue == t3.peek().totalValue) {
				return t1.peek().totalValue;
			}
			if (t1.peek().totalValue >= t2.peek().totalValue && t1.peek().totalValue >= t3.peek().totalValue) {
				t1.pop();
			} else if (t2.peek().totalValue >= t1.peek().totalValue && t2.peek().totalValue >= t3.peek().totalValue) {
				t2.pop();
			} else if (t3.peek().totalValue >= t1.peek().totalValue && t3.peek().totalValue >= t2.peek().totalValue) {
				t3.pop();
			}
		}
	}
}

class Node1 {
	int currValue;
	int totalValue;
	
	public Node1(int value, int total) {
		this.currValue = value;
		this.totalValue = total;
	}
}
