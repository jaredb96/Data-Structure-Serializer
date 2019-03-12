package serial;

public class Serializer {
	
	private class ListNode<T> {
		private T value; 
		private ListNode next; 
		
		/**
		 * Basic constructor 
		 * @param val
		 */
		public ListNode(T val){
			value = val;
			next = null;
		}
		
		public ListNode(T val, ListNode n) {
			value = val;
			next = n;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
