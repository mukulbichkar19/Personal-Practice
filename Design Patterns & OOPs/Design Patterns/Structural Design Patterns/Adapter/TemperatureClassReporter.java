/**
 *
TemperatureClassReporter is a class adapter. It extends CelciusReporter (the adaptee) and implements TemperatureInfo (the target interface). If a temperature is in Celcius, TemperatureClassReporter utilizes the temperatureInC value from CelciusReporter. Fahrenheit requests are internally handled in Celcius.
 */
public class TemperatureClassReporter extends celsiusReporter implements TemperatureInfo{

  public void setTemperatureInC(double tempInC){
    this.tempInC = tempInC;
  }

  public void setTemperatureInF(double tempInF){
    this.tempInC = fToC(tempInF);
  }

  public double getTempInC(){
    return this.tempInC;
  }

  public double getTempInF(){
    return cToF(tempInC);
  }

  private double fToC(double f) {
		return ((f - 32) * 5 / 9);
	}

	private double cToF(double c) {
		return ((c * 9 / 5) + 32);
	}



}
