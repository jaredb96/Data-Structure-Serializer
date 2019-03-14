package serial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import serial.Serializer.ListNode;

class SerializerTest {
	private int[] testArray1 = {1, 2, 3, 4, 5};
	private int[] testArray2 = {1};
	private int[] testArray3 = {};
	private ListNode test1;
	private ListNode test2;
	private ListNode test3;
	
	@Test
	/**
	 * Test listToLinkedList method
	 */
	public void testListToLinkedList() {
		// set up three test cases to check serialization
		test1 = Serializer.listToLinkedList(testArray1);
		test2 = Serializer.listToLinkedList(testArray2);
		test3 = Serializer.listToLinkedList(testArray3);
		
		// create test node for a new test linked list
		ListNode testNode = new ListNode();
		
		// node for testing each link in list
		ListNode testPoint = testNode;
		
		// current node used to build entire test linked list
		ListNode current = testNode;
		for (int i = 1; i < 6; i++) {
			current.val = i;
			current.next = new ListNode();;
			current = current.next;
		}
		
		// for each node in test linked list, assert that the serialized list node
		// is equal to the test node  
		for (int i = 0; i < 5; i++) {
			assertEquals(test1.val, testPoint.val);
			test1 = test1.next;
			testPoint = testPoint.next;
		}
		
		// repeat process of creating linked lists and testing them against serialized
		// lists for subsequent examples (singleton list and empty list)

		testNode = new ListNode();
		testPoint = testNode;
	    current = testNode;
	    for (int i = 0; i < 1; i++) {
	    	current.val = testArray2[i];
			current.next = new ListNode();;
			current = current.next;
		}
				
		for (int i = 0; i < 1; i++) {
			assertEquals(test2.val, testPoint.val);
			test2 = test2.next;
			testPoint = testPoint.next;
		}
		
		
		testNode = new ListNode();
		testPoint = testNode;
	    current = testNode;
	    assertEquals(test3.val, testPoint.val);
		
		

		
		
	}

}
