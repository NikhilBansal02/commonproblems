/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
*/
//Complexity of this program is o(n)
package leetcode;

public class RemoveDuplicatesfromSortedList2 {
	
	ListNode head;
	
	public void insertIntoList(int data) {
		
		ListNode new_node = new ListNode(data);
		
		if(head!=null) {
		new_node.next = head;
		        
		}
		head = new_node;
	}	
	
	 public ListNode deleteAllDuplicates(ListNode l1) {
		 
		 int times[] = new int[10];
		 
		 ListNode temp= l1;
		 
		 while(l1!=null) {
			 
			 times[l1.val]++;
			 l1 = l1.next;
		 }
		 
		 int count = 0;
		 boolean flag = false;
		 
		 for(int i=0;i<10;i++) {
			 
			if(times[i] == 1) {
			  flag = true;
			  if(count == 1)
				  temp = temp.next;
			  temp.val=i;
			  count=1;
			 }
		 }
		 
		 if(flag)
			 temp.next = null;
		 else
			 this.head = null;
		 
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
		
		RemoveDuplicatesfromSortedList2 a1 = new RemoveDuplicatesfromSortedList2();
		
		a1.insertIntoList(4);
		a1.insertIntoList(3);
		a1.insertIntoList(2);
		a1.insertIntoList(1);
		a1.insertIntoList(1);
		a1.insertIntoList(1);
		a1.insertIntoList(1);
		printList(a1.head);
		
		ListNode result = a1.deleteAllDuplicates(a1.head);
		printList(result);
	}

}
