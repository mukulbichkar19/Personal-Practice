public class checkingPalindrome{

    public static void main(String args[]){

        int xor_result;
        System.out.println("Enter the size of the array: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scan.next().charAt(0);
        }
        xor_result = (int)arr[0];
        for(int i=1;i<n;i++){
            int ascii_val = (int)arr[i];
            xor_result = xor_result ^ ascii_val;
            //System.out.println(xor_result);
        }
        if(xor_result == (int)arr[n/2]){
          System.out.println("Palindrome");
        }
        else{
          System.out.println("Not a Palindrome");
        }






    }







}
