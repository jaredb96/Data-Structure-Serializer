package serial;

public class Serializer {
	/**
	 * LinkedList class for serialization
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
	
	/**
	 * Binary tree class for serialization
	 * @author jaredb96
	 *
	 */
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		/**
		 * Default constructor
		 */
		public TreeNode(){
			val = 0;
			left = null;
			right = null;
			
		}
		
		/**
		 * Constructor that initializes root node
		 * @param root of tree
		 */
		public TreeNode(int root) {
			val = root;

		}
		
		/**
		 * Constructor that initializes root node and its two child nodes
		 * @param root of tree
		 * @param leftChild of root node
		 * @param rightChild of root node
		 */
		public TreeNode(int root, TreeNode leftChild, TreeNode rightChild) {
			val = root;
			left = leftChild;
			right = rightChild;
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
		current = null;
		return head;
	}
	
	/**
	 * This method serializes an input Linked List
	 * and outputs it is as an int array
	 * @param head of Linked List to be deserialized
	 * @return int array representing serialized version of input
	 */
	public static int[] linkedListToList(ListNode head){
		/* get size first pass */
		int len = 0;
		ListNode iterator = head;
		while(iterator != null) {
			len++;
			iterator = iterator.next;
		}
		
		/* second pass, add elements to return array */
		int[] serialized = new int[len]; // return array
		iterator = head;
		for(int i=0; i<len; i++) {
			serialized[i] = iterator.val;
			iterator = iterator.next;
		}
		/* return serialized array */
		return serialized;
	}
	
	/**
	 * Method that returns a tree version of the given list
	 * @param array that we are converting to a binary tree
	 * @return tree form of input array
	 */
	public static TreeNode listToTree(int[] array) {
		return null;
	}
	
	/**
	 * Method that returns a list version of the given tree
	 * @param root of TreeNode that we are converting to a list
	 * @return list form of input binary tree
	 */
	public static int[] treeToList(TreeNode root) {
		return null;
	}
	
	
}
