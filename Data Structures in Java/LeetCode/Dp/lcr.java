public class lcr{

  private static void lcr(String s) {

    java.util.LinkedHashSet<Character> current = new java.util.LinkedHashSet<>();
    java.util.LinkedHashSet<Character> max = new java.util.LinkedHashSet<>();

    for(int i=0;i<s.length();i++) {
      if(!current.contains(s.charAt(i))){
        current.add(s.charAt(i));

      }else{

        if(current.size() > max.size()){
          max.clear();
          max.addAll(current);
        }
        current.clear();
        current.add(s.charAt(i));


      }
    }
    System.out.println("Max substring is: "+max.size());
    print(max);
  }

  private static void print(java.util.HashSet<Character> h){

    for(Character i:h) {
      System.out.print(i);
    }
    System.out.println();

  }


  public static void main(String args[]) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the input string: ");
    String s = scan.nextLine();
    lcr(s);
  }

}
