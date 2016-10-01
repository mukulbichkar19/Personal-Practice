    public class PrintAncestors{


      public static boolean printancestor(BinaryTreeNode root, int target){

          if(root == null){
            return false;
          }
          if(root.data == target){
            return true;
          }
          if(printancestor(root.left, target) || printancestor(root.right,target)){
            System.out.println(root.data);
            return true;
          }

          return false;


      }


      public static void main(String args[]){

        BinaryTreeNode root = new BinaryTreeNode(4);
    		BinaryTreeNode leftchild1 = new BinaryTreeNode(2);
    		BinaryTreeNode rightchild1 = new BinaryTreeNode(8);
    		BinaryTreeNode rightchild2 = new BinaryTreeNode(5);
    		BinaryTreeNode rightchild3 = new BinaryTreeNode(7);
    		BinaryTreeNode rightchild4 = new BinaryTreeNode(6);
    		BinaryTreeNode rightchild5 = new BinaryTreeNode(9);

    		root.setLeft(leftchild1);
    		root.setRight(rightchild1);

    		rightchild1.setLeft(rightchild2);
    		rightchild1.setRight(rightchild5);

    		rightchild2.setRight(rightchild3);

    		rightchild3.setLeft(rightchild4);

        PrintAncestors t = new PrintAncestors();
        t.printancestor(root,6);



      }


    }
