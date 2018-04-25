public class CompactPS extends ParkingSlot{

    public CompactPS(){ super(); }

    public CompactPS(int id, int row){
        super(id, row, SlotSize.compact, true);
    }

    public SlotSize getSlotSize(){
        return SlotSize.compact;
    }

}
