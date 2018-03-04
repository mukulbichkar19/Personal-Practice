import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class TryRecursion{

  private static void printReverse(int num){
      // Base Case
      if(num == 0){
        return;
      }
      // Task or actual program logic for subproblem
      System.out.print(num%10 + " ");
      // Continue for remaining chunk
      printReverse(num/10);
  }

  private static boolean isPalindrome(String s){
    // Base Case
    if(s.length() == 1 || s.length()==0){
      return true;
    }
    // Solve subproblem
    if(s.charAt(0) != s.charAt(s.length()-1)){
      return false;
    }
    // Recurse for other subproblems
    return isPalindrome(s.substring(1, s.length()-1));
  }

  private static int binSearch(int[] a, int low, int high, int search){

    // Base Case: element not found
    if(low >= high){
      return -1;
    }

    // Actual solve subproblem
    int mid = (low+high)/2;

    if(a[mid] == search){
      return mid;
    } //Call for further subproblems
    else if(a[mid] > search){
      return binSearch(a, low, mid-1, search);
    }
    return binSearch(a,mid+1,high,search);
  }

  public static void main(String args[]){

    // Program 1: Print digits of a number in reverse order
    printReverse(3459);
    System.out.println();

    // Program 2: Check if a given string is palindrome or not
    if(isPalindrome("alula")){
      System.out.println("is a palindrome");
    }else{
      System.out.println("not a palindrome");
    }

    // Program 3: recursive binary search
    int[] array = {1,2,3,4,5,6,7,8,9};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to be searched: ");
    int x = scan.nextInt();
    int res = binSearch(array,0,array.length,x);
    if(res != -1){
      System.out.println("Element "+x+" present at index: "+res);
    }else{
      System.out.println("Element "+x+" not present in array");
    }


    java.util.TreeSet<String> sorted = new java.util.TreeSet<>(
      new java.util.Comparator<String>(){
        public int compare(String s1, String s2){
          return s2.compareTo(s1);
        }
      }
    );

    sorted.add("fgr");
    sorted.add("aba");
    sorted.add("caa");
    sorted.add("dfr");
    sorted.add("zca");
    sorted.add("aaa");

    System.out.println(sorted);


    int[] nums = {1,4,2,1,3,5,9};
    Set<Integer> set = new HashSet<>(Arrays.asList(nums));
    System.out.println("Set is: ");
    System.out.println(set);

    Set<Integer> p = new HashSet<>();
    p.add(1);
    p.add(23);
    p.add(67);

    // Converting Set to a list
    List<Integer> list = new ArrayList<>(p);
    System.out.println(list);




  }

}
