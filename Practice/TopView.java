import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
public class TopView{

  private static TreeNode root;
  private static Map<Integer, List<TreeNode>> top_view = new TreeMap<>();
  private static List<TreeNode> level_list = new ArrayList<>();
  private static int min_elem = Integer.MAX_VALUE;
  private static int max_elem = Integer.MIN_VALUE;

  private static void printTopView(TreeNode t, int level){

    if(t == null){
      return;
    }


    if(top_view.containsKey(level)){
      List<TreeNode> exists = top_view.get(level);
      exists.add(t);
      top_view.put(level, exists);
    }else{
      List<TreeNode> new_list = new ArrayList<>();
      new_list.add(t);
      top_view.put(level, new_list);
    }
    printTopView(t.left, level-1);
    printTopView(t.right, level+1);
  }


  private static void LevelOrder(TreeNode t){

    if(t == null){
      return;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(t);
    while(!q.isEmpty()){
      TreeNode curr = q.poll();
      level_list.add(curr);
      if(curr.left !=  null){
        q.add(curr.left);
      }

      if(curr.right != null){
        q.add(curr.right);
      }
    }
  }


  private static void printTopUsingLevel(TreeNode t){

    if(t == null){
      return;
    }

    HashSet<Integer> set = new HashSet<>();

    Queue<QItem> Q = new LinkedList<>();
    Q.add(new QItem(t, 0));

    while(!Q.isEmpty()){

      QItem qi = Q.remove();
      int hd = qi.hd;
      TreeNode n = qi.node;

      if(!set.contains(hd)){
        set.add(hd);
        System.out.print(n.val + " ---");
      }

      if(n.left != null){
        Q.add(new QItem(n.left, hd-1));
      }

      if(n.right!=null){
        Q.add(new QItem(n.right, hd+1));
      }

    }
  }


  private static void bottomViewUsingLevel(TreeNode t){

    if(t == null){
      return;
    }

    Map<Integer, Integer> level_with_last = new TreeMap<>();
    Queue<QItem> q = new LinkedList<>();
    q.add(new QItem(t, 0));
    while(!q.isEmpty()){

      QItem curr = q.poll();
      TreeNode n = curr.node;
      int hd = curr.hd;

      level_with_last.put(hd, n.val);

      if(n.left != null){
        q.add(new QItem(n.left, hd-1));
      }

      if(n.right != null){
        q.add(new QItem(n.right, hd+1));
      }
    }

    System.out.println("Bottom View is: ");
    for(Map.Entry<Integer, Integer> entry:level_with_last.entrySet()){
      System.out.print(entry.getValue() + " ");
    }

  }

  private static void findMinMax(TreeNode t){
    if(t != null){
      findMinMax(t.left);
      min_elem = Math.min(min_elem, t.val);
      max_elem = Math.max(max_elem, t.val);
      findMinMax(t.right);
    }
  }


  public static void main(String args[]){

    root = new TreeNode(0);

    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);

    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(15);

    TreeNode left2 = new TreeNode(6);
    TreeNode right2 = new TreeNode(7);

    root.left = left;
    root.right = right;

    //left.right = left1;
    left.left = left1;
    left.right = right1;

    right.left = left2;
    right.right = right2;

    //left1.right = right1;

    //right1.right = left2;
    //bottomViewUsingLevel(root);
    /*LevelOrder(root);
    printTopView(root, 0);
    System.out.println("Top View is: ");
    for(Map.Entry<Integer, List<TreeNode>> entry:top_view.entrySet()){
      int curr_level = entry.getKey();
      List<TreeNode> lists = entry.getValue();
      if(lists.size() == 1){
        System.out.print(lists.get(0).val + " --- ");
      }else{
        int min_index = Integer.MAX_VALUE;
        int max_index = Integer.MIN_VALUE;
        for(int i=0;i<lists.size();i++){
          //min_index = Math.min(min_index, level_list.indexOf(lists.get(i)));
          max_index = Math.max(max_index, level_list.indexOf(lists.get(i)));
        }
        //System.out.print(level_list.get(min_index).val + " --- ");
        System.out.print(level_list.get(max_index).val + " --- ");
      }
    }
    System.out.println("null");*/

    findMinMax(root);
    System.out.println("The minimum is: "+min_elem+" and maximum is: "+max_elem);



  }


}
