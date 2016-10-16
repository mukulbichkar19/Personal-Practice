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

    private static int findMin(BinaryTreeNode root){
        BinaryTreeNode current = root;
        while(current.left != null){
          current = current.left;
        }
        return current.data;
    }

    private static void findPreSucc(BinaryTreeNode root, BinaryTreeNode pre,
                                    BinaryTreeNode succ, int key){

      if(root==null){
        return;
      }
      if(root.data == key){
        if(root.left != null){
          BinaryTreeNode current = root.left;
          while(current.right != null){
            current = current.right;
          }
          pre = current;
        }else{ pre = root;}
        if(root.right != null){
          BinaryTreeNode current = root.right;
          while(current.left != null){
            current = current.left;
          }
          succ = current;
        }
        System.out.println("Precessor is "+pre.data+" "+" successor is "+succ.data);
        return;
      }
      if(root.data > key){
        succ = root;   // To store the succ
        findPreSucc(root.left, pre, succ,key);
      }
      if(root.data < key){
        pre = root;  // Pre to current
        findPreSucc(root.right, pre, succ, key);
      }


   }
   // brute force approach but fails when the element in left tree is greater
   // than root or element in right subtree is
   public static boolean flag = false;
   private static boolean isBST(BinaryTreeNode root){

     //System.out.println(root.data + "  " + flag);
     if(root == null || (root.left==null && root.right==null)){
      return true;
     }
     if(root.left != null && root.right != null){
       if(root.right.data > root.data && root.left.data < root.data)
       {
           flag = true;
       }
      else{
         return false;
       }
       isBST(root.left);
       isBST(root.right);
     }else if(root.left == null && root.right!=null){
       if(root.right.data > root.data)
       {
         flag = true;
       }else{
         flag = false;
         return flag;
        }
        isBST(root.right);
     }else if(root.left != null && root.right==null){
       //System.out.println("entered here");
       if(root.left.data < root.data){
         //System.out.println("Wrong turn");
         flag = true;
       }else{
         flag = false;
         //System.out.println(flag);
         return flag;

       }
        isBST(root.left);
     }
     /*else{
       flag=false;
       return flag;
     }*/

     return flag;
   }

   // Correct method for checking a BST
   private static boolean checkBST(BinaryTreeNode root){
     /*if(isBST(root.left) && isBST(root.right)){
       return true;
     }
     return false;*/
     if(root == null){
       return true;
     }

     if(root.left != null && maxValue(root.left) > root.data)
     {
       return false;
     }

     if(root.right!=null && minValue(root.right) < root.data){
       return false;
     }

     if(!checkBST(root.left) || !checkBST(root.right)){
       return false;
     }
     return true;


   }

   public static int maxValue(BinaryTreeNode temp){
     BinaryTreeNode current = temp;
     int max = current.data;
     while(current != null){
       if(current.data > max){
         max  = current.data;
       }
       current = current.right;
     }
     return max;
   }

   public static int minValue(BinaryTreeNode temp){
     BinaryTreeNode current = temp;
     int min = current.data;
     while(current != null){
       if(current.data < min){
         min  = current.data;
       }
       current = current.left;
     }
     return min;
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
      root.right.setRight(new BinaryTreeNode(16));
      root.right.right.setLeft(new BinaryTreeNode(13));

      // Display tree InOrder
      //inOrder(root);
      java.util.Scanner scan =  new java.util.Scanner(System.in);
      System.out.println("*** Menu ****");
      System.out.println("1.Search a number");
      System.out.println("2.Insert a number");
      System.out.println("3.Find minimum in BST");
      System.out.println("4.Find inorder predecessor and successor");
      System.out.println("5.check is a tree is BST");
      System.out.println("Enter the choice");
      int ch = scan.nextInt();
      switch(ch){
        case 1:  // Search a value in BST

            System.out.println("Enter the number you are searching for: ");
            int value = scan.nextInt();
            if(search(root,value).data != 0){
              System.out.println(search(root,value).data + " found in the BST");
            }else{
              System.out.println(value+ " not found in the BST");
            }
            break;
        case 2:    //Insert into a BST
                System.out.println("Enter the element to be inserted");
                int data = scan.nextInt();
                insert(root,data);
                System.out.println("After insertion");
                inOrder(root);
                break;
        case 3:   // Find minimum in a BST
                System.out.println("The minimum is: "+findMin(root));
                break;
        case 4: // Find the value
                BinaryTreeNode pre = null;
                BinaryTreeNode succ = null;
                System.out.println("Enter the number you want to find for: ");
                int n = scan.nextInt();
                findPreSucc(root,pre,succ,n);
                break;
        case 5:
                //System.out.println(minValue(root));
                if(checkBST(root)){
                    System.out.println("A Binary Search Tree");
                }else{
                  System.out.println("Not a Binary Search Tree");
                }
                break;
        default: System.out.println("Wrong choice");
      }
















  }


}
