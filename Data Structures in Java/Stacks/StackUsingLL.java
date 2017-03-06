public class StackUsingLL{

  private static Node top = null;

  private static void push(int data){
    Node newNode = new Node();
    newNode.data = data;
    if(top == null){
      newNode.next = null;
      top = newNode;
    }else{
      newNode.next = top;
      top = newNode;
    }
  }

  private static int pop(){

    int val = -1;
    if(top != null){
      val = top.data;
      Node temp = top;
      top = top.next;
      temp = null;

    }else{
      System.out.println("Stack Underflow");
    }
    return val;

  }

  private static void display(){
    Node temp = top;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String args[]){

    int ch;
    do{
      System.out.println("***** Menu *****");
      System.out.println("1. Push ");
      System.out.println("2. Pop ");
      System.out.println("3. Peek ");
      System.out.println("4. Display ");
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the choice: ");
      int n = scan.nextInt();
      switch(n){
        case 1: System.out.println("Enter the element to be pushed: ");
                int data = scan.nextInt();
                push(data);
                break;
        case 2: System.out.println(pop() + " popped from stack.");
                break;
        case 3: System.out.println("The element at top of stack is: "+top.data);
                break;
        case 4: display();
                break;
        default: System.out.println("Wrong Choice");
      }
      System.out.println("Do you want to continue:(1) ");
      ch = scan.nextInt();
    }while(ch==1);




  }




}
