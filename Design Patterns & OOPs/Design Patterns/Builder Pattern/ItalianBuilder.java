//Our first Concrete Builder is ItalianMealBuilder. Its constructor creates a meal. Its methods are implemented to build the various parts of the meal. It returns the meal via getMeal().
public class ItalianBuilder implements MealBuilder{

  private Meal meal;

  public ItalianBuilder(){
    meal = new Meal();
  }

  public void buildDrink(){
    meal.setDrink("wine");
  }

  public void buildMainCourse(){
    meal.setMainCourse("pasta");
  }

  public void buildSide(){
    meal.setSide("bread");
  }

  public Meal getMeal(){
    return this.meal;
  }




}
