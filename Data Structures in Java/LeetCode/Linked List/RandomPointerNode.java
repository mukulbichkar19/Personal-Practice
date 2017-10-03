public class RandomPointerNode{

    int label;
    RandomPointerNode next;
    RandomPointerNode random;

    public RandomPointerNode(int label){
        this.label = label;
        this.next = null;
        this.random = null;
    }

    public RandomPointerNode(int label, RandomPointerNode next,
                             RandomPointerNode random){
        this.label = label;
        this.next = next;
        this.random = random;
    }




}
