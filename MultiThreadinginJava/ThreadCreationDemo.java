public class ThreadCreationDemo{



  public static void main(String args[]){

      myThread t1 = new myThread();

      t1.start();

      for(int i=0;i<10;i++){
        System.out.println("Main thread");
      }


  }



}
