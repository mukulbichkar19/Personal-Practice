/*

   Find the two repeating elements in a given array
   You are given an array of n+2 elements. All elements of the array are in
   range 1 to n.
   And all elements occur once except two numbers which occur twice.
   Find the two repeating numbers.

   For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5

   The above array has n + 2 = 7 elements with all elements occurring once
   except 2 and 4 which occur twice.
   So the output should be 4 2.

 */

public class findTwoRepeatingElements {


// Using Two Loops
private static void usingTwoLoops(int[] arr){
        System.out.println("1. Using Two Loops");
        for(int i=0; i<arr.length; i++) {
                for(int j=i+1; j<arr.length; j++) {
                        if(arr[i] == arr[j]) {
                                System.out.println("Repeatitive element is: "
                                                   +arr[i]);
                        }
                }
        }
        System.out.println();
}

// Using Sorting and count
private static void usingSortingAndCount(int[] arr){

        System.out.println("2. Inside Sorting and Count");
        java.util.Arrays.sort(arr); // Sort array O(nlgn)

        for(int i=0; i<arr.length-1; i++) {
                if(arr[i] == arr[i+1]) {
                        System.out.println("Repeatitive element is: "+arr[i]);
                }
        }
        System.out.println();

}

// Usign Hashset
private static void usingHashset(int[] arr){

        System.out.println("3. Using HashSet");
        java.util.HashSet<Integer> hashset = new java.util.HashSet<Integer>();
        for(int i=0; i<arr.length; i++) {
                if(!hashset.add(arr[i])) {
                        System.out.println("Repeatitive element is: "+arr[i]);
                }
        }
        System.out.println();
}

// Using Negation
private static void usingNegation(int[] arr){
        System.out.println("4. Using Negation");
        for(int i=0; i<arr.length; i++) {

                if(arr[Math.abs(arr[i])] < 0) {
                        System.out.println("Repeatitive element is: "+
                        Math.abs(arr[i]));
                }else{
                        arr[Math.abs(arr[i])] = -1*arr[Math.abs(arr[i])];
                }

        }
        System.out.println();
}


public static void main(String args[]){

        int[] array = {4, 2, 4, 5, 2, 3, 1};

        // Method 1: Using two loops complexity O(n^2)
        usingTwoLoops(array);

        // Method 2: Sorting and count O(n*logn)
        usingSortingAndCount(array);

        // Method 3: Using HashMap O(n) and space: O(n)
        usingHashset(array);

        // Method 4: Using negation O(n)
        usingNegation(array);


}

}
