public class HikeStrategy implements Strategy{
    public boolean checkTemperature(int tempF){
      if((tempF >= 50) && (tempF <= 90)){
        return true;
      }else{
        return false;
      }
    }
}
