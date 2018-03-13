public class KadaneAlgorithm{

  // Used to find maximum sum contiguous subarray in an array

  public static void main(String arg[]){

    //int[] mat = {−2,1,−3,4,−1,2,1,−5,4};

    int[] mat = new int[9];
    mat[0] = -2;
    mat[1] = 1;
    mat[2] = -3;
    mat[3] = 4;
    mat[4] = -1;
    mat[5] = 2;
    mat[6] = 1;
    mat[7] = -5;
    mat[8] = 4;


    int max_so_far = mat[0];
    int max_ending_here = mat[0];

    for(int i=1;i<mat.length;i++) {
      max_ending_here = Math.max(mat[i], max_ending_here + mat[i]);
      max_so_far = Math.max(max_so_far, max_ending_here);
    }

    System.out.println("Max sum subarray is: "+max_so_far);
    System.out.println("Max ending is: "+max_ending_here);

  }

}
