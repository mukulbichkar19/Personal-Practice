/**
 * TemperatureObjectReporter is an object adapter. It is similar in functionality to TemperatureClassReporter, except that it utilizes composition for the CelciusReporter rather than inheritance.
 */
public class TemperatureObjectReporter implements TemperatureInfo{

  celsiusReporter celsiusReporter;

  public TemperatureObjectReporter(){
    celsiusReporter = new celsiusReporter();
  }

  public double getTempInC(){
    return celsiusReporter.getTemperature();
  }

  public double getTempInF(){
    return cToF(celsiusReporter.getTemperature());
  }

  public void setTemperatureInC(double tempInC){
    celsiusReporter.setTemperature(tempInC);
  }

  public void setTemperatureInF(double tempInF){
    celsiusReporter.setTemperature(fToC(tempInF));
  }

  private double fToC(double f) {
		return ((f - 32) * 5 / 9);
	}

	private double cToF(double c) {
		return ((c * 9 / 5) + 32);
	}



}
