public class PostFixEvaluation {

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

  private static int postfixeval(char[] exp){

    int result = 1;
    int val1 = 1;
    int val2 = 1;
    for(int i=0;i<exp.length;i++){

      switch(exp[i]){

        case '*' : val1 = pop();
                   val2 = pop();
                   push(val1*val2);
                   break;
        case '/' : val1 = pop();
                   val2 = pop();
                   push(val2/val1);
                   break;
        case '+' : val1 = pop();
                   val2 = pop();
                   push(val1+val2);
                   break;
        case '-' : val1 = pop();
                   val2 = pop();
                   push(val2-val1);
                   break;
        default : push(exp[i]-'0');

      }
    }
    return pop();
  }



public static void main(String args[]){

  char exp[] = {'2','3','1','*','+','9','-'};
  System.out.println("The final evaluation is: "+postfixeval(exp));






}

}
