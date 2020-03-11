/*You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 *You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/
package leetcode;


public class AddTwoNumInSLL {
	
	ListNode head;
	
	public void insertIntoList(int data) {
		
		ListNode new_node = new ListNode(data);
		
		if(head!=null) {
		new_node.next = head;
		        
		}
		head = new_node;
		
		         
	}	
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     
		 int sum = 0;
		 int carry = 0;
		 
		 while(l1!= null && l2 !=null) {
			 sum = l1.val + l2.val;
			 if((sum+carry)<=9) {
				this.insertIntoList(sum+carry); 
				carry = 0;
			 }
			 else {
				 sum = (sum+carry)%10;
				 carry = 1;
				 this.insertIntoList(sum); 
			 }
			 l1 = l1.next;
			 l2 = l2.next;
		 }
		 
		 while(l1!=null) {
			 if((carry+l1.val)<=9) {
				 this.insertIntoList((carry+l1.val)); 
					carry = 0;
			 }else {
				 carry = 1;
				 this.insertIntoList((carry+l1.val)%10);
			 }
			 l1 = l1.next;
		 }
		 while(l2!=null) {
			 if((carry+l2.val)<=9) {
				 this.insertIntoList((carry+l2.val)); 
					carry = 0;
			 }else {
				 carry = 1;
				 this.insertIntoList((carry+l2.val)%10);
			 }
			 l2 = l2.next;
		 }
		 if(carry==1) {
			 this.insertIntoList(1); 
				carry = 0;
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
		
		AddTwoNumInSLL a1 = new AddTwoNumInSLL();
		AddTwoNumInSLL a2 = new AddTwoNumInSLL();
		AddTwoNumInSLL res = new AddTwoNumInSLL();
		
		a1.insertIntoList(9);
		a1.insertIntoList(9);
		a1.insertIntoList(9);
		a1.insertIntoList(8);
		printList(a1.head);
		
		a2.insertIntoList(4);
		a2.insertIntoList(6);
		a2.insertIntoList(5);
		a2.insertIntoList(8);
		a2.insertIntoList(8);
		printList(a2.head);
		
		ListNode result = res.addTwoNumbers(a1.head,a2.head);
		printList(result);
	}

}
