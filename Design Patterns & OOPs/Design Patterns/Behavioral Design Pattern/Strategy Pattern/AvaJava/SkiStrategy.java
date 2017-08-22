public class SkiStrategy implements Strategy{

  public boolean checkTemperature(int tempF) {
		if (tempF <= 32) {
			return true;
		} else {
			return false;
		}
	}
  
}
