// Interface for the WeatherSubject
public interface WeatherSubject{

  public void addObserver(WeatherObserver weatherObserver);

  public void removeObserver(WeatherObserver weatherObserver);

  public void doNotify();

}
