import java.util.Map;
import java.util.LinkedHashMap;

public class DiagonalSum{

  private static TreeNode root;
  private static Map<Integer, Integer> diagonal_sum = new LinkedHashMap<>();

  private static void inOrderDisp(TreeNode t){
    if(t!=null){
      inOrderDisp(t.left);
      System.out.print(t.val + " ");
      inOrderDisp(t.right);
    }
  }

  private static void findDiagonalSum(TreeNode t, int level){

    if(t == null){
      return;
    }

    if(diagonal_sum.containsKey(level)){
      int existing_sum = diagonal_sum.get(level);
      existing_sum += t.val;
      diagonal_sum.put(level, existing_sum);
    }else{
      diagonal_sum.put(level, t.val);
    }

    findDiagonalSum(t.left, level-1);
    findDiagonalSum(t.right, level);

  }






  public static void main(String args[]){

     root = new TreeNode(1);

     TreeNode left = new TreeNode(2);
     TreeNode right = new TreeNode(3);

     TreeNode left1 = new TreeNode(9);
     TreeNode right1 = new TreeNode(6);

     TreeNode left2 = new TreeNode(10);
     TreeNode right2 = new TreeNode(11);

     TreeNode left3 = new TreeNode(4);
     TreeNode right3 = new TreeNode(5);

     TreeNode left4 = new TreeNode(12);
     TreeNode right4 = new TreeNode(7);

     root.left = left;
     root.right = right;

     left.left = left1;
     left.right = right1;

     right.left = left3;
     right.right = right3;

     left1.right = left2;

     right1.left = right2;

     left3.left = left4;
     left3.right = right4;

     //inOrderDisp(root);
     System.out.println();


     findDiagonalSum(root, 0);
     System.out.println("Diagonal Sums are: ");
     for(Map.Entry<Integer, Integer> entry:diagonal_sum.entrySet()){
       System.out.println(entry.getValue());
     }







  }



}
