public class RoomDecorator implements Room{
    protected Room room;
    
    public RoomDecorator(Room room) {
        this.room = room;
    }
    
    @Override
    public double getPrice() {
        return room.getPrice();
    }
}
