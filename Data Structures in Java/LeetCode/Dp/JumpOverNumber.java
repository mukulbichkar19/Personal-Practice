import java.util.ArrayList;
import java.util.List;
public class JumpOverNumber{

  private static int jump_over_numbers(List<Integer> list) {
        // Write your code here
        int jump_count = 0;
        int n = list.size();
        if(n == 0){
            return jump_count;
        }else{
            int next_pos = 1;
            while(next_pos <= n){
                if(list.get(next_pos-1) != 0){
                    next_pos += list.get(next_pos-1);
                    jump_count++;
                }else{
                    return -1;
                }
            }
        }
        return jump_count;
    }

  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(0);
    list.add(5);
    list.add(6);
    list.add(9);
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    int cnt = jump_over_numbers(list);
    System.out.println(cnt);



  }

}
