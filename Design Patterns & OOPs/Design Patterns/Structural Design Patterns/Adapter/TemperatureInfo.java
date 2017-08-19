// Here is our target interface that will be implemented by our adapter. It defines actions that our adapter will perform.
public interface TemperatureInfo{



  public void setTemperatureInC(double tempInC);

  public double getTempInC();

  public void setTemperatureInF(double tempInF);

  public double getTempInF();



}
