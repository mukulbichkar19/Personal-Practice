public class UniqueString{


  private static boolean bruteForce(String s){

    // Null or empty string
    if(s == null || s.length() == 0){
      return false;
    }

    for(int i=0;i<s.length();i++){
      for(int j=i+1;j<s.length();j++){
        if(s.charAt(i) == s.charAt(j)){
          return false;
        }
      }
    }
    return true;
  }


  private static boolean hashTable(String s){

    // Null or empty string
    if(s == null || s.length() == 0){
      return false;
    }

    boolean[] present = new boolean[256];

    for(int i=0;i<s.length();i++){
      if(present[s.charAt(i)]){
        return false;
      }else{
        present[s.charAt(i)] = true;
      }
    }
    return true;
  }


  private static boolean hashSet(String s){

    // Null or empty string
    if(s == null || s.length() == 0){
      return false;
    }

    java.util.HashSet<Character> hashset = new java.util.HashSet<>();

    for(int i=0;i<s.length();i++){
      if(hashset.contains(s.charAt(i))){
        return false;
      }else{
        hashset.add(s.charAt(i));
      }
    }
    return true;
  }


  private static boolean bitVectors(String s){

    // Null or empty string
    if(s == null || s.length() == 0){
      return false;
    }

    int checker = 0;
    for(int i=0;i<s.length();i++){
      int val = s.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) return false;
      checker |= (1 << val);
    }

    return true;

  }


  private static boolean bySorting(String s){

    if(s==null || s.length()==0){
      return false;
    }

    char[] charsArray = new char[s.length()];
    charsArray = s.toCharArray();
    java.util.Arrays.sort(charsArray);
    // Internally uses randomized quicksort whose
    // time complexity is O(n*logn)
    for(int i=0;i<charsArray.length-1;i++){
      if(charsArray[i] == charsArray[i+1]){
        return false;
      }
    }

    return true;

  }


  public static void main(String args[]){

      String unique = "tinmoy";
      String polluted = "abacfgh";
      String selected = null;
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Choose a string: ");
      System.out.println("1. Unique");
      System.out.println("2. Polluted");
      int n = scan.nextInt();
      if(n == 1){
        selected = unique;
      }else{
        selected = polluted;
      }

      // Method 1: Brute Force
      // Run time: O(n^2)
      // Space: O(1)
      if(bruteForce(selected)){
        System.out.println("Brute Force: A unique string.");
      }else{
        System.out.println("Brute Force: NOT a unique string.");
      }


      // Method 2: Using HashTable of size 256 all booleans
      // Run time: O(n)
      // Space: O(256)
      if(hashTable(selected)){
        System.out.println("Hash table: A unique string.");
      }else{
        System.out.println("Hash table: NOT a unique string.");
      }


      // Method 3: Using HashSet
      // Run time: O(n)
      // Space: O(n)
      if(hashSet(selected)){
        System.out.println("Hash Set: A unique string.");
      }else{
        System.out.println("Hash Set: NOT a unique string.");
      }

      // Method 4: Using Sorting
      // Run time: O(nlogn)
      // Space: O(n)
      if(bySorting(selected)){
        System.out.println("Sorting: A unique string.");
      }else{
        System.out.println("Sorting: NOT a unique string.");
      }

      // Method 5: Using Bit vectors
      // Run time: O(n)
      // Space: O(1)
      // Special Note: Works only when the string contains a to z.
      if(bitVectors(selected)){
        System.out.println("Bit Vectors: A unique string.");
      }else{
        System.out.println("Bit Vectors: NOT a unique string.");
      }










  }


}
