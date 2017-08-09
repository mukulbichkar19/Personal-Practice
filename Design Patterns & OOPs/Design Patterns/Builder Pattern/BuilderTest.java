public class BuilderTest{




  public static void main(String args[]){
    MealBuilder mealBuilder = new ItalianBuilder();
    MealDirector mealDirector = new MealDirector(mealBuilder);
    mealDirector.constructMeal();
    Meal meal = mealDirector.getMeal();
    System.out.println("Italian meal is: "+meal.getDrink()+" "+meal.getMainCourse()+" "+meal.getSide());

    mealBuilder = new IndianMealBuilder();
    mealDirector = new MealDirector(mealBuilder);
    mealDirector.constructMeal();
    meal = mealDirector.getMeal();
    System.out.println("Indian meal is: "+meal.getDrink()+" "+meal.getMainCourse()+" "+meal.getSide());

  }

}
