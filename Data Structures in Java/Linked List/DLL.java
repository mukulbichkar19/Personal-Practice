public class DLL {

    int data;
    DLL prev;
    DLL next;
    
    public DLL(){

    }

    public DLL(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
    }
}
