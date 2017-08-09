// Our Builder interface is MealBuilder. It features methods used to build a meal and a method to retrieve the meal.
public interface MealBuilder{
  public void buildDrink();
  public void buildMainCourse();
  public void buildSide();
  public Meal getMeal();
}
