public class ExcelTitle{



  public static void main(String args[]){


    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = scan.next();

    char[] c = s.toCharArray();

    int pos = 0;
    int sum = 0;
    for(int i=c.length-1;i>=0;i--){
      sum += Math.pow(26,pos++)*(c[i] - 'A' + 1);
    }
    System.out.println("The val is: "+sum);
    //System.out.println("Division is: " + 'A' - sum/26);


  }

}
