// The Demo class demonstrates the command pattern. It instantiates a Lunch (receiver) object and creates a LunchCommand (concrete command) with the Lunch. The LunchCommand is referenced by a Command interface reference. Next, we perform the same procedure on the Dinner and DinnerCommand objects. After this, we create a MealInvoker object with lunchCommand, and we call the invoke() method of mealInvoker. After this, we set mealInvoker's command to dinnerCommand, and once again call invoke() on mealInvoker.

public class Demo{
    public static void main(String args[]){

      Lunch lunch = new Lunch(); // receiver
      LunchCommand lunchCommand = new LunchCommand(lunch);// concrete command

      Dinner dinner = new Dinner(); // receiver
		  Command dinnerCommand = new DinnerCommand(dinner); // concrete command

      MealInvoker mealInvoker = new MealInvoker(lunchCommand);// invoker
      mealInvoker.invoke();

      mealInvoker.setCommand(dinnerCommand);
      mealInvoker.invoke();






    }
}
