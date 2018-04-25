public class HandicappedPS extends ParkingSlot{

    public HandicappedPS(){ super(); }

    public HandicappedPS(int id, int row){
        super(id, row, SlotSize.handicapped, true);
    }

    public SlotSize getSlotSize(){
        return SlotSize.handicapped;
    }

}
