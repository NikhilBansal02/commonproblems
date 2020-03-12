package leetcode;

public class PallindromeSLL {
	
ListNode head;
	
	public void insertIntoList(int data) {
		
		ListNode new_node = new ListNode(data);
		
		if(head!=null) {
		new_node.next = head;
		        
		}
		head = new_node;
		
	}	
	
	 public  boolean isPalindrome(ListNode x) {
		 
		 int times[] = new int[10];
		 int count = 0;
		 
		 while(x!=null) {
			 
			 times[x.val]++;
			 x = x.next;
		 }
		 for(int i=0;i<10;i++) {
			 if(times[i]%2 == 0 ) {
				 continue;
			 }
			 else {
				count++; 
			 }
		 }
		 
		 if(count==0 || count==1)
			 return true;
		 else
			 return false;
		 
	 }
	 public static void printList(ListNode p1) {
		 while(p1!=null) {
			 System.out.print(p1.val +" ");
			 p1 = p1.next;
		 }
		 System.out.println();
		 
	 }
	 
	public static void main(String[] args) {
		
		PallindromeSLL a1 = new PallindromeSLL();
		a1.insertIntoList(6);
		a1.insertIntoList(9);
		a1.insertIntoList(8);
		a1.insertIntoList(7);
		a1.insertIntoList(7);
		a1.insertIntoList(7);
		a1.insertIntoList(8);
		a1.insertIntoList(9);
		a1.insertIntoList(6);
		
		printList(a1.head);
		
		System.out.println(a1.isPalindrome(a1.head));
		
	}

}
