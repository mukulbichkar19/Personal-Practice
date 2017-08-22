public class Test{

  public static void main(String args[]){

    Meal meal1 = new HamburgerMeal();
    meal1.doMeal();

    System.out.println();
    
    meal1 = new IndianMeal();
    meal1.doMeal();


  }


}
