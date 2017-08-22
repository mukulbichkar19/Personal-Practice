// DietInfoCaretaker is the caretaker class that is used to store the state (ie, the memento) of a DietInfo object (ie, the originator). The memento is stored as an object since DietInfo.Memento is not visible to the caretaker. This protects the integrity of the data stored in the Memento object. The caretaker's saveState() method saves the state of the DietInfo object. The caretaker's restoreState() method restores the state of the DietInfo object.

public class DietInfoCaretaker{

    Object objMemento;

    public void saveState(DietInfo dietInfo) {
		    objMemento = dietInfo.save();
	  }

    public void restoreState(DietInfo dietInfo) {
		    dietInfo.restore(objMemento);
	  }





}
