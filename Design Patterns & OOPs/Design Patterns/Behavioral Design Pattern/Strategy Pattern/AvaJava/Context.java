// The Context class contains a temperature and a reference to a Strategy. The Strategy can be changed, resulting in different behavior that operates on the same data in the Context. The result of this can be obtained from the Context via the getResult() method.

public class Context{
    int tempF;
    Strategy strategy;

    public Context(int tempF, Strategy strategy) {
		      this.tempF = tempF;
		      this.strategy = strategy;
	  }

    public void setStrategy(Strategy strategy){
      this.strategy = strategy;
    }

    public int getTemperatureInF(){
      return this.tempF;
    }

    public boolean getResult(){
      return strategy.checkTemperature(tempF);
    }


}
