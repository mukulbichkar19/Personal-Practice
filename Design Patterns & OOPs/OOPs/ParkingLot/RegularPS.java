public class RegularPS extends ParkingSlot{

    public RegularPS(){ super(); }

    public RegularPS(int id, int row){
        super(id, row, SlotSize.regular, true);
    }

    public SlotSize getSlotSize(){
        return SlotSize.regular;
    }

}
