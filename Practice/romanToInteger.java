public class romanToInteger{


  private static int lookUp(char c){

    switch(c) {
      case 'I' : return 1;

      case 'V' : return 5;

     case 'X' : return 10;

      case 'L' : return 50;

     case 'C' : return 100;

    case 'D' : return 500;

    case 'M' : return 1000;

    }
    return -1;

  }


  private static int getConverted(String roman) {

    int sum = 0;
    for(int i=0;i<roman.length();i++){
      int val1 = lookUp(roman.charAt(i));
      // If valid i++ then only proceed
      if(i+1 < roman.length()){

        int val2 = lookUp(roman.charAt(i+1));
        if(val1 >= val2) {
          sum = sum + val1;
        }else{
          sum += val2-val1;
          i++;
        }
      }
      else{
        sum += val1;
        i++;
      }
    }
    return sum;


  }

  private static int convertFromEnd(String s){

    int prev = 0;
    int current = 0;
    int sum = 0;
    for(int j=s.length()-1;j>=0;j--){
      current = lookUp(s.charAt(j));
      if(current >= prev){
        sum += current;
      }else{
        sum -= current;
      }
      prev = current;
    }
    return sum;


  }


  public static void main(String args[]){

    String roman = args[0];
    //int equivalent = getConverted(roman);
    int equivalent = convertFromEnd(roman);
    System.out.println(equivalent);

  }

}
