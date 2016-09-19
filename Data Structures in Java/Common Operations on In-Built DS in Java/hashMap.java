public class hashMap{

  public static java.util.Map<String,Integer> hashMap
                    = new java.util.HashMap<>();
/* Common Operations needed

  1. Add elements inside a hashMap
  2. Iterate over the hashMap
  3. Remove elements inside a hashMap
  4. finding a size of hashMap
  5. while Iterating over the hashMap if a  number exists inside hashMap remove it.

*/




  public static void main(String args[]){

    java.util.Scanner scan = new java.util.Scanner(System.in);
    char ans;
    do{

        System.out.println("****  Menu ****");
        System.out.println("1. Add elements inside a hashMap ");
        System.out.println("2. Print elements of a hashMap");
        System.out.println("3. Remove elements inside a hashMap");
        System.out.println("4. Find the size of a hashMap");
        int choice = scan.nextInt();
        switch(choice){

          case 1: System.out.println("Enter the key: ");
                  String key = scan.next();
                  insert(key);
                  break;
          case 2: printmap();
                  break;
          case 3: System.out.println("Enter the key you want to remove: ");
                  String key_for_removal = scan.next();
                  hashMap.remove(key_for_removal);
                  break;
          case 4: System.out.println("The size of hashMap is: "+hashMap.size());
                   break;
          default:System.out.println("Wrong choice, please try again");

        }
        System.out.println("Do you want to continue(y/n): ");
        ans = scan.next().charAt(0);
    }while(ans == 'y' || ans == 'Y');



  }

  private static void insert(String key){

    if(hashMap.containsKey(key)){
      // If already the key is present just incerement its value.
      int value = 0;
      for(java.util.Map.Entry<String,Integer> entry:hashMap.entrySet()){
        if(entry.getKey().equals(key)){
          value = entry.getValue() + 1;
        }
        hashMap.put(key,value);
      }
    }else{
      // First occurence of the key so value is set to 1.
      hashMap.put(key,1);
    }

  }

 // There are two ways to iterate over a hashMap
 // first is using a iterator and second one using entrySet
 // the entrySet is more suitable and will be followed
  private static void printmap(){

    for(java.util.Map.Entry<String, Integer>
                      entry:hashMap.entrySet()){
      System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
    }


  }

}
