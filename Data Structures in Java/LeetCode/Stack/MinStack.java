import java.util.Stack;

public class MinStack{

  static Stack<Integer> stack;
  static int min = Integer.MAX_VALUE;

  public MinStack(){
    stack = new Stack();
  }

  public static void push(int x){
    if(x < min){
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public static void pop(){
    int elem = stack.pop();
    if(elem == min){
      min = stack.pop();
    }
  }

  public static int getMin(){
    return min;
  }

  public static boolean isEmpty(){
    return stack.isEmpty();
  }


  public static void main(String args[]){

        MinStack min = new MinStack();
        push(18);
        push(19);
        push(29);
        push(15);
        push(16);
        System.out.println("Min is: "+getMin());
        pop();
        pop();
        System.out.println("New min is: "+getMin());
        System.out.println(stack.isEmpty());
        pop();
        pop();
        pop();
        System.out.println(stack.isEmpty());


  }


}
