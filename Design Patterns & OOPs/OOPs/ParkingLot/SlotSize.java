public enum SlotSize{

    regular(0), handicapped(1), compact(2);
    private int value;
    private SlotSize(int value){ this.value = value; }
    private int getValue(){ return this.value; }
    private static SlotSize getSlotFromSize(int value){
        SlotSize selectedSlot = regular;
        switch(value){
            case 0: selectedSlot = regular;
                    break;
            case 1: selectedSlot = handicapped;
                    break;
            case 2: selectedSlot = compact;
                    break;
        }
        return selectedSlot;
    }
}
