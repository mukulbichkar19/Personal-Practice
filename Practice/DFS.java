import java.util.*;
public class DFS{

  private static Map<Integer, List<Integer>> adjList;
  //private static int[][] matrix;


  public static void main(String args[]){

    double a = 0.1+0.1+0.1;
    double b = 0.3;
    System.out.println(a + " :: " +b);
    System.out.println(a == b);

   	adjList = new HashMap<>();

    adjList.put(0, new ArrayList<>(Arrays.asList(1,4)));
    adjList.put(1, new ArrayList<>(Arrays.asList(0,2,3,4)));
    adjList.put(2, new ArrayList<>(Arrays.asList(1,3)));
    adjList.put(3, new ArrayList<>(Arrays.asList(1,2,4)));
    adjList.put(4, new ArrayList<>(Arrays.asList(0,1,3)));


    // Adjacency List
    DFS(0);
    System.out.println();
    int[][] matrix = {{0,1,0,0,1},{1,0,1,1,1},{0,1,0,1,0},{0,1,1,0,1},{1,1,0,1,0}};


    int[] visited_mat = new int[matrix.length];
    System.out.println("DFS in matrix: ");
    DFSMat(matrix,visited_mat,0);
    System.out.println();
   	//display(matrix);
    System.out.println("BFS is: ");
    BFS(0);
    System.out.println();
  }

  private static void BFS(int n){

      HashSet<Integer> visited = new HashSet<>();
      Queue<Integer> q = new LinkedList<>();

      q.add(n);
      visited.add(n);

      while(!q.isEmpty()){

        int top = q.poll();
        System.out.print(top + " ");
        List<Integer> connected = adjList.get(top);

        for(Integer c:connected){
          if(!visited.contains(c)){
            visited.add(c);
            q.add(c);
          }
        }


      }


  }


  private static void DFSMat(int[][] matrix, int[] visited_mat, int i){


    visited_mat[i] = 1;

    System.out.print(i + " ");

    for(int j=0;j<matrix.length;j++){

      if(visited_mat[j] == 0 && matrix[i][j] == 1){
         DFSMat(matrix,visited_mat,j);
      }

    }
  }

  private static void display(int[][] mat){

    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }


  private static void DFS(int n){

    HashSet<Integer> visited = new HashSet<>(); //Visited

    DFSUtil(n, visited);

  }

  private static void DFSUtil(int n, HashSet<Integer> visited){

       visited.add(n);
       System.out.print(n + " ");

       List<Integer> connected = adjList.get(n);

      for(Integer c:connected){

        if(!visited.contains(c)){
          visited.add(c);
          DFSUtil(c, visited);
        }

    }

  }




}
