/**
 * The AdapterDemo class is a client class that demonstrates the adapter pattern. First, it creates a TemperatureClassReporter object and references it via a TemperatureInfo reference. It demonstrates calls to the class adapter via the TemperatureInfo interface. After this, it creates a TemperatureObjectReporter object and references it via the same TemperatureInfo reference. It then demonstrates calls to the object adapter.
 */
public class AdapterDemo{

  public static void main(String args[]){
      // class adapter
  		System.out.println("class adapter test");
  		TemperatureInfo tempInfo = new TemperatureClassReporter();
  		testTempInfo(tempInfo);

      // object adapter
  		System.out.println("\nobject adapter test");
  		tempInfo = new TemperatureObjectReporter();
  		testTempInfo(tempInfo);
  }


  public static void testTempInfo(TemperatureInfo tempInfo) {
  		tempInfo.setTemperatureInC(0);
  		System.out.println("temp in C:" + tempInfo.getTempInC());
  		System.out.println("temp in F:" + tempInfo.getTempInF());

  		tempInfo.setTemperatureInF(85);
  		System.out.println("temp in C:" + tempInfo.getTempInC());
  		System.out.println("temp in F:" + tempInfo.getTempInF());
  	}





}
