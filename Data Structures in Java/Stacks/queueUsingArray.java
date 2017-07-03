public class queueUsingArray{

  static int queue_size = 3;
  static int[] queue = new int[queue_size];
  static int front = -1;
  static int rear = -1;

  private static boolean isFull(){
    if(rear == queue_size-1){
      return true;
    }
    return false;
  }

  private static boolean isEmpty(){
    if(front == -1 && rear == -1)
      return true;
    return false;
  }

  private static void enqueue(int num){
    if(isEmpty()){
      front++;
      rear++;
      queue[front] = num;
    }else{
      rear++;
      queue[rear] = num;
    }
  }

  private static int dequeue(){
    int n = queue[front];
    if(front == rear){
      front = -1;
      rear = -1;
      return n;
    }
    for(int i=front+1;i<=rear;i++){
      queue[i-1] = queue[i];
    }
    rear = rear-1;
    return n;
  }

  private static void print(){
    if(isEmpty()){
      System.out.println("queue is empty");
    }else{
      for(int i=front;i<=rear;i++){
        System.out.print(queue[i] + " ");
      }
      System.out.println();
    }

  }



  public static void main(String args[]){

    int ans;
    do{
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("**** Menu ****");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("Enter your choice: ");
        int ch = scan.nextInt();
        switch(ch){
          case 1: System.out.println("Enter the number to enqueue: ");
                  int num = scan.nextInt();
                  if(isFull()){
                    System.out.println("Queue Full cannot push");
                  }else{
                    enqueue(num);
                    System.out.println(num + " enqueued into queue");
                  }
                  break;
          case 2: if(isEmpty()){
                    System.out.println("Queue empty cannot dequeue");
                  }else{
                    int n = dequeue();
                    System.out.println(n + " dequeued from queue");
                  }
                  break;
          case 3: print();
                  break;
          default: System.out.println("Wrong Choice");
        }
        System.out.println("Press 1 to continue (or 0 to exit): ");
        ans = scan.nextInt();
    }while(ans==1);










  }


}
