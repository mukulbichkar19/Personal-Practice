public class checkPalindrome-2{

    public static void main(String args[]){

        System.out.println("Enter the size of the array: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scan.next();
        }
        System.out.println("The entered array is : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }





    }







}
