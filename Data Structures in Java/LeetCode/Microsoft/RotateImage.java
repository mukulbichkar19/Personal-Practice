public class RotateImage{


  private static void rotateImage(int[][] image){

      int n = image.length;
      // Layer by layer rotation
      // for(int i=0;i<= n/2;i++){
      //   for(int j=i;j<n-i;j++){
      //
      //     int temp = image[i][j];
      //     image[i][j] = image[n-j][i];
      //     image[n-j][i] = image[n-i][n-j];
      //     image[n-i][n-j] = image[j][n-i];
      //     image[j][n-i] = temp;
      //
      //   }
      // }

      // For clockwise
      // 1. Reverse first and last row
      // 2. Swap for symmetry

      // 1. reverse first and last
      for(int i=0;i<n;i++){
        int temp = image[0][i];
        image[0][i] = image[n-1][i];
        image[n-1][i] = temp;
      }

      // 2. Swap for symmetry
      for(int i=0;i<n;++i){
        for(int j=i+1;j<image[i].length;++j){
          int temp = image[i][j];
          image[i][j] = image[j][i];
          image[j][i] = temp;
        }
      }




      System.out.println("After reversal: ");
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(image[i][j] + " ");
        }
        System.out.println();
      }




  }


  public static void main(String args[]){

      int[][] image = {{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};

      rotateImage(image);


  }


}
