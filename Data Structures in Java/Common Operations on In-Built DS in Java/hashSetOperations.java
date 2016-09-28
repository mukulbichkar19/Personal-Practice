public class hashSetOperations{

    public static java.util.HashSet<Integer> hashset = new java.util.HashSet<>();
  /* Common Operations needed

    1. Add elements inside a hashSet
    2. Iterate over the hashSet
    3. Remove elements inside a hashSet
    4. finding a size of hashSet
    5. while Iterating over the hashSet if a  number exists inside hashSet remove it.

  */
  // In HashSet there are no duplicates, and also the order of elements
  // are not present.The elements are stored based on hash values.
  // If order is important then LinkeHashSet can be used

  public static void printHashSet(){

    // Multiple ways of adding hashSet
    // 1. Using Iterator
    // 2. Without Iterator
    java.util.Iterator<Integer> itr = hashset.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next() + " ");
    }

    // 2. Without Iterator
    // using foreach loop
    System.out.println("Iterating using foreach loop: ");
    for(Integer i:hashset){
      System.out.print(i + " ");
    }

  }



  public static void main(String args[]){

      java.util.Scanner scan = new java.util.Scanner(System.in);
      char ans = 'y';
      do{
          System.out.println("***** Menu *****");
          System.out.println("1. Add elements ");
          System.out.println("2. Iterate and print over hashSet");
          System.out.println("3. Remove elements in hashSet");
          System.out.println("4. Display size of hashSet");
          System.out.println("5. Stimulate Duplicate Scenario");
          System.out.println("Enter the choice: ");
          int choice = scan.nextInt();
          switch(choice){
            case 1 :  System.out.println("Enter the data");
                      int data = scan.nextInt();
                      hashset.add(data);
                      break;
            case 2 :  printHashSet();
                      break;
            case 3 :  System.out.println("Enter the data you want to remove: ");
                      int data1 = scan.nextInt();
                      if(hashset.remove(data1)){
                        System.out.println(data1 + " removed from Set.");
                      }else{
                        System.out.println(data1 + " does not exists in the set.");
                      }
                      break;
            case 4 :  System.out.println("The size of hashSet is "+hashset.size());
                      break;
            case 5 :  System.out.println("Enter the number that already exists: ");
                      int duplicate = scan.nextInt();
                      if(hashset.contains(duplicate)){
                        hashset.remove(duplicate);
                      }
                      else{
                        hashset.add(duplicate);
                      }
                      break;
            default : System.out.println("Wrong Choice");
          }
          System.out.println("Do you want to continue(y/n): ");
          ans = scan.next().charAt(0);
      }while(ans=='y' || ans=='Y');




  }


}
