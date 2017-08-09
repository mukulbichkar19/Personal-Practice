// Our Director class is MealDirector. It takes a MealBuilder as a parameter in its constructor. Thus, a different type of meal will be assembled by the MealDirector depending on the Concrete Builder passed in to the constructor. The assembly of the meal (Product) takes place in the constructMeal() method of the Director. This method spells out the parts of the meal that will be assembled.
public class MealDirector{

    private MealBuilder mealBuilder = null;

    public MealDirector(MealBuilder mealBuilder){
      this.mealBuilder = mealBuilder;
    }

    public void constructMeal(){
      mealBuilder.buildDrink();
      mealBuilder.buildMainCourse();
      mealBuilder.buildSide();
    }

    public Meal getMeal(){
      return this.mealBuilder.getMeal();
    }


}
