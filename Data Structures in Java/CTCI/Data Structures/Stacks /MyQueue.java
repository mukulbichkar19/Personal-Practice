public class MyQueue<T>{

  private static class QueueNode<T>{

    private T data;
    private QueueNode next;

    public QueueNode(T data){
      this.data = data;
    }
  }

  private QueueNode<T> first;
  private QueueNode<T> last;

  // add
  public void add(T item){
    QueueNode<T> newNode = new QueueNode<T>(item);
    if(last != null){
      last.next = newNode;
    }
    last = newNode;
    if(first == null){
      first = last;
    }
  }

  // remove
  public T remove(){
    if(first == null) {
      System.out.println("Queue is empty");
    }
    T item = first.data;
    first = first.next;
    if(first == null){
      last = null;
    }
    return item;
  }

  // peek
  public T peek(){
    if(isEmpty()){
      System.out.println("Queue is empty");
    }
    return first.data;
  }

  // isEmpty
  public boolean isEmpty(){
    return first==null;
  }


}
