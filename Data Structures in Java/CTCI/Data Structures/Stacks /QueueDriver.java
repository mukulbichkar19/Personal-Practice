public class QueueDriver{


  public static void main(String args[]){

    MyQueue<Integer> queue = new MyQueue<Integer>();
    queue.add(1);
    queue.add(9);
    queue.add(10);
    System.out.println("Peek of queue is: "+queue.peek());
    queue.remove();
    queue.remove();
  



  }




}
