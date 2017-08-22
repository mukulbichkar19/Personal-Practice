// originator - object whose state we want to save
public class DietInfo{

  String personName;
  int dayNumber;
  int weight;

  public DietInfo(String personName, int dayNumber, int weight){
    this.personName = personName;
    this.dayNumber = dayNumber;
    this.weight = weight;
  }

  public String toString(){
    return "Name: "+this.personName+", day number: "+this.dayNumber+", weight "+this.weight;
  }

  public void setDayNumberAndWeight(int dayNumber, int weight){
    this.dayNumber = dayNumber;
    this.weight = weight;
  }

  public Memento save(){
    return new Memento(personName, dayNumber, weight);
  }

  public void restore(Object objMemento){
    Memento memento = (Memento) objMemento;
    personName = memento.mementoPersonName;
    dayNumber = memento.mementodayNumber;
    weight = memento.mementoweight;
  }


  // memento - object that stores the saved state of the originator
  private class Memento{
    String mementoPersonName;
    int mementodayNumber;
    int mementoweight;

    public Memento(String mementoPersonName, int mementodayNumber, int mementoweight){
      this.mementoPersonName = mementoPersonName;
      this.mementodayNumber = mementodayNumber;
      this.mementoweight = mementoweight;
    }

  }




}
