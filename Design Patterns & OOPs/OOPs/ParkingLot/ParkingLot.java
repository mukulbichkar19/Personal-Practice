import java.util.*;
public class ParkingLot{

    private String name;
    private Map<Integer, List<ParkingSlot>> parkingSpaces;
    private List<Customer> customers;
    private int row_no = 4;
    private int no_slots_each_row = 10;

    public ParkingLot(){ }

    public ParkingLot(String name){
        this.name = name;
        this.parkingSpaces = new HashMap<>();
        this.customers = new ArrayList<>();
    }

    public void createParkingSpaces(){

        for(int row=1;row<=row_no;row++){

            int selectedRowId = row;

            for(int j=1;j<=no_slots_each_row;j++){

                ParkingSlot ps = null;

                switch(j){
                    case 1: ps = new HandicappedPS(selectedRowId, j);
                            break;
                    case 3: ps = new HandicappedPS(selectedRowId, j);
                            break;
                    case 2: ps = new CompactPS(selectedRowId, j);
                            break;
                    case 9: ps = new CompactPS(selectedRowId, j);
                            break;
                    default: ps = new RegularPS(selectedRowId, j);
                }

                List<ParkingSlot> slots = null;
                if(parkingSpaces.containsKey(selectedRowId)){
                    slots = parkingSpaces.get(selectedRowId);
                }else{
                    slots = new ArrayList<>();
                }
                slots.add(ps);
                parkingSpaces.put(selectedRowId, slots);
                ps = null;
            }
        }
    }


    protected void displayPS(){
        for(Map.Entry<Integer, List<ParkingSlot>> entry:parkingSpaces.entrySet()){
            System.out.println("Selected Row is: " + entry.getKey());
            List<ParkingSlot> lists = entry.getValue();
            for(ParkingSlot l:lists){
                System.out.println("ps id: "+ l.getSlotId() +
                " row_id: "+  l.getRow() + " slot_size: " + l.getSlotSize()
                + " isSlotFree: " + l.getSlotStatus());
            }
        }
    }

    public void initializeCustomers(int no_customers){

        Customer c = null;

        for(int i=1;i<=no_customers;i++){

            if(i%2 == 0){
                c = new Member(i,"","","");
            }else{
                c = new Guest(i, "", "", "");
            }
            this.customers.add(c);
            c = null;
        }
    }

    public void displayCustomers(){
        for(Customer c:customers){
            System.out.println("Selected customer with id: "+c.getId()
            +" is Member: " + c.isMember());
        }
    }



}
