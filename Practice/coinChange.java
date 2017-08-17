public class coinChange{

  public static int[] mem;
  // Recursion Basic Overlapping Subproblems
  private static int coinChange2(int[] val,int target){
    if(target == 0){
      return 0;
    }
    int coins = Integer.MAX_VALUE;
    for(int i=0;i<val.length;i++){
      if(target >= val[i]) {
        coins = Math.min(coins, 1+coinChange2(val,target-val[i]));
      }
    }
    return coins;
  }

  private static int coinChangeMem(int[] val,int target){
    if(target == 0){
      return 0;
    }
    if(mem[target] > 0){
      return mem[target];
    }
    int coins = Integer.MAX_VALUE;
    for(int i=0;i<val.length;i++){
      if(target >= val[i]) {
        coins = Math.min(coins, 1+coinChange2(val,target-val[i]));
      }
    }
    mem[target] = coins;
    return mem[target];
  }


  public static void main(String args[]) {

    int[] val = {1,3,5};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the target sum: ");
    int sum = scan.nextInt();
    mem = new int[sum+1];
    // int minCoins = coinChange2(val, sum);
    // System.out.println("Minimum number of coins needed is: "+minCoins);
    int minCoins = coinChangeMem(val, sum);
    System.out.println("Minimum number of coins needed is: "+minCoins);




  }


}
