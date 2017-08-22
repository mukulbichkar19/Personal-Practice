import java.util.Iterator;
public class Demo{


  public static void displayMenu(Menu menu, Iterator iterator){
    System.out.println("\nDisplaying Menu:");
		while (iterator.hasNext()) {
			Item item = (Item)iterator.next();
			System.out.println(item);
		}
  }

  public static void main(String args[]){
    Item i1  = new Item("spaghetti", 7.50f);
    Item i2 = new Item("pizza", 3.95f);
    Item i3 =  new Item("chicken tikka", 9.0f);

    Menu menu = new Menu();
    menu.addItem(i1);
    menu.addItem(i2);
    menu.addItem(i3);
    Iterator<Item> iterator = menu.iterator();
    displayMenu(menu, iterator);

    System.out.println("\nRemoving last item returned");
		iterator.remove();
    
    Iterator<Item> iterator1 = menu.iterator();
    displayMenu(menu, iterator1);

  }


}
