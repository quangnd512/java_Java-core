package CollectionsAndFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("fullname", "Nguyen Dinh Quang");
		map.put("tuoi", "25");
		System.out.println(map.get("tuoi"));
		
		// Danh sach key
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("Key: "+key);
		}
		
		
		//Stack vs Queues
		//Queues
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("A1");
		queue.offer("A2");
		queue.offer("A3");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//Stack
		Stack<String> stack = new Stack<String>();
		stack.push("Q1");
		stack.push("Q2");
		stack.push("Q3");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
