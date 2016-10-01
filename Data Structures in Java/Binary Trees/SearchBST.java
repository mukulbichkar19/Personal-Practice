  public class SearchBST{

    public static void inOrder(BinaryTreeNode node){
      if(node==null){
        return;
      }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
      }

      // search
      public static BinaryTreeNode search(BinaryTreeNode node, int value){
        // 0 is a code for not found (My implementation)
        if(node==null){
          return new BinaryTreeNode(0);
        }
        if(node.data == value){
          return node;
        }
        if(node.data > value){
          return search(node.left,value);
        }
        return search(node.right,value);
      }

      // insert
      public static BinaryTreeNode insert(BinaryTreeNode root, int data){
        return root = insertRec(root,data);
      }

      public static BinaryTreeNode insertRec(BinaryTreeNode root, int data){
          if(root == null){
            root = new BinaryTreeNode(data);
            return root;
          }
          if(root.data > data){
             root.left = insertRec(root.left, data);
          }else if(root.data < data){
            root.right = insertRec(root.right, data);
          }
          return root;
      }



    public static void main(String args[]){

        BinaryTreeNode root = new BinaryTreeNode(8);
        // Constructing a left subtree
        root.setLeft(new BinaryTreeNode(3));
        root.setRight(new BinaryTreeNode(10));

        root.left.setLeft(new BinaryTreeNode(1));
        root.left.setRight(new BinaryTreeNode(6));

        root.left.right.setLeft(new BinaryTreeNode(4));
        root.left.right.setRight(new BinaryTreeNode(7));

        // Constructing a right sub tree
        root.right.setRight(new BinaryTreeNode(14));
        root.right.right.setLeft(new BinaryTreeNode(13));

        // Display tree InOrder
        inOrder(root);

        // Search a value in BST
        java.util.Scanner scan =  new java.util.Scanner(System.in);
        System.out.println("Enter the number you are searching for: ");
        int value = scan.nextInt();
        if(search(root,value).data != 0){
          System.out.println(search(root,value).data + " found in the BST");
        }else{
          System.out.println(value+ " not found in the BST");
        }

        //Insert into a BST
        System.out.println("Enter the element to be inserted");
        int data = scan.nextInt();
        insert(root,data);
        System.out.println("After insertion");
        inOrder(root);






    }


  }
