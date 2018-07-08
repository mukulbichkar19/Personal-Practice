import java.util.*;
public class ForEach{

  /**
   * iterateOverMap : Iterate over a map using ForEach
   * @author Mukul
   */
  private static void iterateOverMap() {
    Map<String, String> foodCategory = new HashMap<>();
    foodCategory.put("Soda", "Beverage");
    foodCategory.put("Chicken Soup", "Appetizers");
    foodCategory.put("Pizza", "Main Course");
    foodCategory.put("Tiramisu", "Desert");

    // Print all elements of the map
    foodCategory.forEach((k, v) -> System.out.println(k + " :: " + v));

    // Operate on each individual key value pair
    foodCategory.forEach((k,v) -> {
      if(v.equals("Beverage")){
        System.out.println(k);
      }
    });
  }

  /**
   * iterateOverLists : Iterate over the lists
   * @author Mukul
   */
  private static void iterateOverLists() {
    List<String> cars = new ArrayList<>();
    cars.add("SUV");
    cars.add("Limousine");
    cars.add("Sedans");
    cars.add("Pickup trucks");

    // Iterate and print list elements
    cars.forEach(x -> System.out.println(x));

    // Iterate over list and operate on each individual element
    cars.forEach(x -> {
      if(x.equals("Sedans")){
        System.out.println("I want to buy " + x);
      }
    });
  }




  public static void main(String args[]){

    iterateOverMap();

    iterateOverLists();

  }


}
