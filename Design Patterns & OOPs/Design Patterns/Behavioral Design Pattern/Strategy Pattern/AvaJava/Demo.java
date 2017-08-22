public class Demo{


  public static void main(String args[]){

    int tempF = 60;

    Strategy skiStrategy = new SkiStrategy();
    Context context = new Context(tempF, skiStrategy);

    System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());

    Strategy hikeStrategy = new HikeStrategy();
    context.setStrategy(hikeStrategy);

    System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());



  }


}
