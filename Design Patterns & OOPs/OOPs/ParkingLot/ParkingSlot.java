abstract class ParkingSlot{

    protected int id;
    protected int row_no;
    protected SlotSize slot_size;
    protected boolean isOccupied;

    public ParkingSlot(){}

    public ParkingSlot(int id, int row_no, SlotSize s, boolean isOccupied){
        this.id = id;
        this.row_no = row_no;
        this.slot_size = s;
        this.isOccupied = isOccupied;
    }


    public abstract SlotSize getSlotSize();
    //public abstract setSlotSize();

    public void markOccupied(){
        this.isOccupied = true;
    }

    public void markFree(){
        this.isOccupied = false;
    }

    public int getRow(){
        return this.row_no;
    }

    public int getSlotId(){
        return this.id;
    }

    public boolean getSlotStatus(){
        return this.isOccupied;
    }
}
