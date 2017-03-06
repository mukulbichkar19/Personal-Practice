public class StackUsingArray {

  // Declare the max capacity
  final static int MAX = 100;
  // Declare an array
  static int[] stack = new int[MAX];
  static int top = -1;

  private static void push(int data){
    top++;
    if(top < MAX){
        stack[top] = data;
    }else{
      System.out.println("Stack Overflow.");
    }

  }

  private static void display(){
    if(top > MAX){
      System.out.println("Stack Overflow.");
    }else if(top == -1){
      System.out.println("Stack Underflow.");
    }else{
      for(int i=top; i>=0; i--){
        System.out.print(stack[i] + " ");
      }
    }
  }

  private static int pop(){
    int val = 0;
    if(top != -1 && top!= MAX){
      val = stack[top];
      top--;
    }
    return val;
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
    System.out.println("Enter the choice ");
    int n = scan.nextInt();
    switch(n){
      case 1: System.out.println("Enter the element to be pushed: ");
              int data = scan.nextInt();
              push(data);
              break;
      case 2: int val = pop();
              System.out.println(val + " popped from stack.");
              break;
      case 3: System.out.println("The element at top of stack is: "+stack[top]);
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
