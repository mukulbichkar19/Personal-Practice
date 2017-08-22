//The WeatherStation class implements WeatherSubject. It is our subject class. It maintains a set of WeatherObservers which are added via addObserver() and removed via removeObserver(). When WeatherSubject's state changes via setTemperature(), the doNotify() method is called, which contacts all the WeatherObservers with the temperature via their doUpdate() methods.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WeatherStation implements WeatherSubject{

  Set<WeatherObserver> weatherObservers;
  int temperature;

  public WeatherStation(int temperature){
    weatherObservers = new HashSet<>();
    this.temperature = temperature;
  }

  public void addObserver(WeatherObserver weatherObserver){
    weatherObservers.add(weatherObserver);
  }

  public void removeObserver(WeatherObserver weatherObserver){
    weatherObservers.remove(weatherObserver);
  }

  public void doNotify(){
    Iterator<WeatherObserver> it = weatherObservers.iterator();
    while(it.hasNext()){
      WeatherObserver weatherObserver = it.next();
      weatherObserver.doUpdate(temperature);
    }
  }

  public void setTemperature(int newTemperature){
    System.out.println("\nWeather station setting temperature to " + newTemperature);
		temperature = newTemperature;
		doNotify();
  }





}
