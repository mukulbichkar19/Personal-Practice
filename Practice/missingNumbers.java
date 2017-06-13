public class missingNumbers{

  private java.util.List<Integer> findMiss(int[] arr){

    java.util.List<Integer> list = new java.util.ArrayList<>();

    for(int i=0;i<arr.length;i++){
      int val = Math.abs(arr[i])-1;
      if(arr[val] > 0){
        arr[val] = -arr[val];
      }
    }

    for(int i=0;i<arr.length;i++){
      if(arr[i] > 0){
        list.add(i+1);
      }
    }

    return list;


  }

  public static void main(String args[]){

    int[] arr = {4,3,2,7,8,2,3,1};
    missingNumbers a = new missingNumbers();
    java.util.List<Integer> arrayList = a.findMiss(arr);
    System.out.println("List is: ");
    for(Integer i:arrayList){
      System.out.println(i);
    }




  }

}
