/*
   A Plaindrome is a string that is exactly identical even after
   reversal.

   Different Approaches:
   1. Using Stack :-
   Put elements from 1..mid in a stack
   Move pointer to mid+1
   Pop elements from stack and check against the mid+1 to end ifs same palindrome

   2. Reversing the second half of link List:-
   reverse from mid+1 to end
   And check with one pointer at start and the other at mid+1
   If both are same then palindrome.

   3. Using XOR operation (my way)
   Find the mid of link List
   Put pointer from start till mid and store its xor result in a variable.
   Start another pointer from mid+1 till end and store the xor result in
   another variable.
   XOR the two variables and if answer is 0, then palindrome.

 */


public class checkPalindromeInLL {

private static Node head;

private static boolean findPalindromeXOR(Node head){

        Node slow = head;
        Node fast = head;
        Node mid = null;
        // for odd length linked list
        // Stopping condition is fast.next != null
        // and for even length linked list is fast != null
        while(fast != null && fast.next!=null) {

                slow = slow.next;
                fast = fast.next.next;

        }
        mid = slow;

        //System.out.println("Middle of linked list is: "+mid.data);
        int xor = 0;
        slow = head;
        fast = mid.next;
        while(slow != mid) {
                xor = xor^slow.data;
                slow = slow.next;
        }

        while(fast != null) {
                xor = xor^fast.data;
                fast = fast.next;
        }

        if(xor == 0) {
                return true;
        }
        return false;

}


public static void main(String args[]){


        head = new Node(10,
                        new Node(15,
                                 new Node(20,
                                          new Node(15,
                                                   new Node(10,null
                                                            )))));

        if(findPalindromeXOR(head)) {
                System.out.println("Is a Palindrome");
        }else{
                System.out.println("Is not a Palindrome");
        }



}


}
