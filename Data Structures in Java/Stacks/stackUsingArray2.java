public class stackUsingArray2{
  static int stack_size = 3;
  static int[] stack = new int[stack_size];
  static int top = -1;


  private static boolean isFull(){
    if(top+1 == stack_size)
      return true;
    return false;
  }

  private static boolean isEmpty(){
    if(top == -1)
      return true;
    return false;
  }

  private static void push(int num){
    top = top+1;
    stack[top] = num;
  }

  private static int pop(){
    int n = stack[top];
    top--;
    return n;
  }

  private static void print(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
    }else{
      for(int i=top;i>=0;i--){
        System.out.println(stack[i]);
      }
    }
  }


  public static void main(String args[]){
    int ans;
    do{
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("**** Menu ****");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("Enter your choice: ");
        int ch = scan.nextInt();
        switch(ch){
          case 1: System.out.println("Enter the number: ");
                  int num = scan.nextInt();
                  if(isFull()){
                    System.out.println("Stack Overflow cannot push");
                  }else{
                    push(num);
                    System.out.println(num + " pushed into stack");
                  }
                  break;
          case 2: if(isEmpty()){
                    System.out.println("Stack underflow cannot pop");
                  }else{
                    int n = pop();
                    System.out.println(n + " popped from stack");
                  }
                  break;
          case 3: print();
                  break;
          default: System.out.println("Wrong Choice");
        }
        System.out.println("Press 1 to continue: ");
        ans = scan.nextInt();
    }while(ans==1);




  }

}
