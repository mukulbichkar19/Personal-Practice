public class DeepCopyofLinkedList{

    private static RandomPointerNode head = null;

    private static RandomPointerNode copyRandomList(RandomPointerNode head){

        /*
        // Method 1: Using HashMap extra space of O(n)
        java.util.Map<RandomPointerNode, RandomPointerNode> map = new java.util.HashMap<>();

        // 1. Create a hashmap with key as node in original list and value as
        //    new node with same value
        RandomPointerNode temp = head;
        while(temp != null){
            map.put(temp, new RandomPointerNode(temp.label));
            temp = temp.next;
        }

        // 2.Iterate over the original list and connect next and random pointer
        RandomPointerNode temp2 = head;
        while(temp2 != null){
            map.get(temp2).next = map.get(temp2.next);
            map.get(temp2).random = map.get(temp2.random);
            temp2 = temp2.next;
        }

        return map.get(head);
        */

        // Creating a copy of linked list and inserting it in between.
        RandomPointerNode temp = head;
        RandomPointerNode copyHead = null;

        while(temp != null){

            RandomPointerNode copy = new RandomPointerNode(temp.label);
            copy.next = temp.next;
            temp.next = copy;
            temp = temp.next.next;

        }

        copyHead = head.next; // Make new head the node next to original head

        // Change the random pointers
        RandomPointerNode temp1 = head;
        while(temp1 != null){
            temp1.next.random = temp1.random.next;
            temp1 = temp1.next.next;
        }

        // Change the next pointers
        RandomPointerNode temp2 = head;
        RandomPointerNode temp3 = head.next;
        while(temp2.next != null){
            temp3 = temp2.next;
            temp2.next = temp2.next.next;
            temp2 = temp3;
        }




        // Display the list
        RandomPointerNode t = copyHead;
        while(t!=null){
            System.out.println(t.label + " random "+t.random.label);
            t = t.next;
        }












        return copyHead;

    }


    private static void display(RandomPointerNode head){

        RandomPointerNode temp = head;
        while(temp != null){
            if(temp.next != null){
                System.out.println(temp.label + " next is: "+temp.next.label+" and random is: "+temp.random.label);
            }else{
                System.out.println(temp.label + " next is: null " + " random is: "+temp.random.label);
            }
            temp = temp.next;
        }
    }


    public static void main(String args[]){

        head = new RandomPointerNode(1);
        RandomPointerNode node1 = new RandomPointerNode(2);
        RandomPointerNode node2 = new RandomPointerNode(3);
        RandomPointerNode node3 = new RandomPointerNode(4);
        RandomPointerNode node4 = new RandomPointerNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        head.random = node2;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = node1;

        // System.out.println("Original List");
        // display(head);
        RandomPointerNode copyList = copyRandomList(head);
        //display(head);

        // RandomPointerNode copyList = copyRandomList(head);
        // System.out.println("Copied List" + copyList.label);
        // display(copyList);



    }


}
