public class JacuzziRoomDecorator extends RoomDecorator{
    public final int amount = 20;
    public JacuzziRoomDecorator(Room room) {
        super(room);
    }
    @Override
    public double getPrice(){
        return room.getPrice() + amount;
    }
}
