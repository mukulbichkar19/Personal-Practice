
public class MyStack<T>{

  private static class StackNode<T>{
    private T data;
    private StackNode<T> next;

    public StackNode(T data){
      this.data = data;
    }
  }


  private StackNode<T> top;

  // pop
  public T pop(){

    if(isEmpty()){
      System.out.println("Stack is Empty");
    }
    T item = top.data;
    top = top.next;
    return item;
  }

  // push
  public void push(T item){
    StackNode<T> newNode = new StackNode<T>(item);
    newNode.next = top;
    top = newNode;
  }

  // peek
  public T peek(){
    if(isEmpty())
      //throw new myEmptyStackException();
      System.out.println("Stack is empty");
    return top.data;
  }

  // isEmpty
  public boolean isEmpty(){
    return top == null;
  }








}
