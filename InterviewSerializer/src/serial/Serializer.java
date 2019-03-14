package serial;

public class Serializer {
	/**
	 * LinkedList class for serializing
	 * @author jaredb96
	 *
	 */
	public static class ListNode{
		int val;
		ListNode next;
		
		/**
		 * Default ListNode constructor
		 */
		ListNode(){
			val = 0;
			next = null;
		}
		
		/**
		 * ListNode constructor which initializes head node
		 * @param value to initialize
		 */
		ListNode(int value){
			val = value;
			next = null;
		}
		
		
		
	}

	public static void main(String[] args) {
		// Simple test for serializing an element array
		int[] test = {1, 2, 3, 4, 5};
		ListNode testLinked = listToLinkedList(test);
		ListNode iterator = testLinked;
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.print(iterator.val);
			}
			else {
				System.out.print(iterator.val + "->");
			}

			iterator = iterator.next;
		}
		
		

	}
	
	/**
	 * Method that creates a singly-linked list version of a given array
	 * @param array to be serialized
	 * @return head node of linked list version of array
	 */
	public static ListNode listToLinkedList(int[] array) {
		// head node of resulting linked list
		ListNode head = new ListNode();
		
		// current node for iterating through linked list
		ListNode current = head;
		
		for (int i = 0; i < array.length; i++) {
			current.val = array[i];
			current.next = new ListNode();
			current = current.next;
		}
		current.next = null;
		return head;
	}

}
