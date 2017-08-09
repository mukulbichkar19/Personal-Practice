public class IndianMealBuilder implements MealBuilder{

  private Meal meal;

  public IndianMealBuilder(){
     meal = new Meal();
  }

  public void buildDrink(){
    meal.setDrink("lassi");
  }
  public void buildMainCourse(){
    meal.setMainCourse("chicken tikka masala");
  }
  public void buildSide(){
    meal.setSide("papad");
  }
  public Meal getMeal(){
    return this.meal;
  }





}
