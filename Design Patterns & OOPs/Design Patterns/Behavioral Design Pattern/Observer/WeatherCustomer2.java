public class WeatherCustomer2 implements WeatherObserver {

    public void doUpdate(int temperature){
      System.out.println("Weather customer 2 just realized out the temperature is:" + temperature);
    }


}
