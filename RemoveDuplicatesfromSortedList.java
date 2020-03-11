/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
*/
package leetcode;

public class RemoveDuplicatesfromSortedList {
	
	ListNode head;
	
	public void insertIntoList(int data) {
		
		ListNode new_node = new ListNode(data);
		
		if(head!=null) {
		new_node.next = head;
		        
		}
		head = new_node;
	}	
	
	 public ListNode deleteDuplicates(ListNode l1) {
		 ListNode temp;
		 
		 while(l1!=null && l1.next!=null) {
			 if(l1.val == l1.next.val ) {
				 temp = l1.next.next;
				 l1.next.next = null;
				 l1.next=temp;
			 }else {
			 l1 = l1.next;
			 }
		 }
		  return(this.head);
		 
	    }
	 
	 public static void printList(ListNode p1) {
		 while(p1!=null) {
			 System.out.print(p1.val +" ");
			 p1 = p1.next;
		 }
		 System.out.println();
		 
	 }
	
	public static void main(String[] args) {
		
		RemoveDuplicatesfromSortedList a1 = new RemoveDuplicatesfromSortedList();
		
		a1.insertIntoList(3);
		a1.insertIntoList(3);
		a1.insertIntoList(2);
		a1.insertIntoList(2);
		a1.insertIntoList(1);
		printList(a1.head);
		
		ListNode result = a1.deleteDuplicates(a1.head);
		printList(result);
	}

}
