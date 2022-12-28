package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println(ll); // []
		ll.add(5);
		ll.add(7);
		System.out.println(ll); // [5, 7]
		System.out.println(ll.peek());  // silmeden ilk elemani bana getirir 5
		System.out.println(ll.peekFirst());  // silmeden ilk elemani bana getirir 5

		/*
		The element() method returns the object at the top of the current queue,
		without removing it. If the queue is empty this method returns exception. //NoSuchElementException
		 */
		System.out.println(ll.element()); // 5

		/*
		The poll() method of the Queue interface
		returns the object at the top of the current queue
		and removes it. If the queue is empty this method returns null.
		 */
		System.out.println(ll.poll()); // 5
		System.out.println(ll); // [7]

		System.out.println(ll.poll()); // 7
		System.out.println(ll); // []

		System.out.println(ll.poll()); // null
		System.out.println(ll.hashCode()); // 1 java'nin vedigi hash code'u doner
		
		
		LinkedList<Integer> ll2 = new LinkedList<>();

		/*
		This method retrieves, but does not remove, the first element of this list,
		or returns null if this list is empty. This works similar to peek().
		 */
		System.out.println(ll2.peekFirst()); // null
		/*
		The peek() method returns the object at the top of the current queue,
		without removing it. If the queue is empty this method returns null.
		 */
		System.out.println(ll2.peek()); // null

		ll2.add(7);
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10));
		System.out.println(ll2); //[7, 10]

		/*
		The push() method adds new items to the end of an array.
		The push() method changes the length of the array.
		The push() method returns the new length.
		 */
		ll2.push(2); // addFirst() ile ayni

		System.out.println(ll2); //[2, 7, 10]
		
		
		

	}

}
