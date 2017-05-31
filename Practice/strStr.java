public class strStr{

  private static int strstr(String haystack, String needle) {
    if(haystack==null && needle==null){
          return 0;
        }else if(haystack.trim().length()==0 && needle.trim().length()==0){
          return 0;
        }else if(haystack.length()==1 && needle.length()==1){
            if(haystack.charAt(0) == needle.charAt(0)){
                return 0;
            }else{
                return -1;
            }
        }
        if(needle.length() <= haystack.length()){
            for(int i=0;i+needle.length()<=haystack.length();i++){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
             }
        }

            return -1;
  }

  private static int best(String haystack, String needle) {
    int l1 = haystack.length(), l2 = needle.length();
       if (l1 < l2) {
           return -1;
       } else if (l2 == 0) {
           return 0;
       }
       int threshold = l1 - l2;
       for (int i = 0; i <= threshold; ++i) {
           if (haystack.substring(i,i+l2).equals(needle)) {
               return i;
           }
       }
       return -1;
  }


  public static void main(String args[]){

    String haystack = args[0];
    String needle = args[1];
    int sol = best(haystack, needle);
    System.out.println(sol);


  }

}
