public class StackUsingLL{


  public static void main(String args[]){

    MyStack<Integer> stack = new MyStack<Integer>();
    stack.push(3);
    stack.push(9);
    stack.push(12);
    stack.pop();
    System.out.println("The top of stack is: "+stack.peek());


  }



}
