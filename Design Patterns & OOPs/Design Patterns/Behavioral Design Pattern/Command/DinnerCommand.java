public class DinnerCommand implements Command{

  Dinner dinner;

  public DinnerCommand(Dinner dinner){
    this.dinner = dinner;
  }

  public void execute(){
    dinner.makeDinner();
  }


}
