// Here is the Menu class. It has a list of menu items of type Item. Items can be added via the addItem() method. The iterator() method returns an iterator of menu items. The MenuIterator class is an inner class of Menu that implements the Iterator interface for Item objects. It contains basic implementations of the hasNext(), next(), and remove() methods.

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Menu{

  List<Item> menuItems;

  public Menu(){
    menuItems = new ArrayList<>();
  }

  public void addItem(Item newItem){
    menuItems.add(newItem);
  }

  public Iterator<Item> iterator() {
		return new MenuIterator();
	}

  class MenuIterator implements Iterator<Item>{
    int currentIndex = 0;

    public boolean hasNext(){
      if(currentIndex >= menuItems.size()){
        return false;
      }else{
        return true;
      }
    }

    public Item next() {
      return menuItems.get(currentIndex++);
    }

    public void remove(){
      menuItems.remove(--currentIndex);
    }



  }






}
