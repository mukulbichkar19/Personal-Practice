public class TestCloning{

  public static void main(String args[]){

    CloneFactory animalCreator = new CloneFactory();
    Sheep sally = new Sheep();

    Sheep clonedSheep = (Sheep) animalCreator.getClone(sally);

    System.out.println(sally);

    System.out.println(clonedSheep);

    System.out.println("Sally hashCode: "+System.identityHashCode(System.identityHashCode(sally)));

    System.out.println("Cloned hashCode: "+System.identityHashCode(System.identityHashCode(clonedSheep)));

  }
}
