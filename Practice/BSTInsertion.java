import java.util.Scanner;
public class BSTInsertion{

  private static TreeNode root = null;

  private static void insertNode(int val){

      TreeNode node = new TreeNode(val);
      if(root == null){
        root = node;
      }
      else{
          TreeNode temp = root;
          while(temp != null){
            if(val < temp.val){
              if(temp.left == null){
                temp.left = node;
                temp = null;
              }else{
                temp = temp.left;
              }
            }else{
              if(val > temp.val){
                if(temp.right == null){
                  temp.right = node;
                  temp = null;
                }else{
                  temp = temp.right;
                }
              }

            }
          }
      }
  }

  private static void print(TreeNode t){
    if(t!=null){
      System.out.println(t.val);
      print(t.left);
      print(t.right);
    }
  }



  public static void main(String args[]){

    int ans = 0;
    Scanner scan = new Scanner(System.in);
    do{

      System.out.println("*** Menu ****");
      System.out.println("1. Insert ");
      System.out.println("2. Display ");
      System.out.println("Enter your choice: ");
      int ch = scan.nextInt();
      switch(ch){

        case 1: System.out.println("Enter the node value: ");
                int val = scan.nextInt();
                insertNode(val);
                break;
       case 2: print(root);
                break;
      default: System.out.println("Wrong Choice");
      }
      System.out.println("Press 1 to continue or 0 to exit.");
      ans = scan.nextInt();
    }while(ans == 1);






  }


}
