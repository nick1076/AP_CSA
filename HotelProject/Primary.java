public class Primary{

    static HotelRoom room;
    static HotelRoom elderlyRoom;

    public static void main(String[] args){
        Person p1 = new Person(5.4, 25, "John", "Brown");
        Person p2 = new Person(3.6, 34, "Bob", "Blond");
        Person p3 = new Person(4.5, 22, "Joe", "White");
        Person p4 = new Person(4.5, 90, "Brian", "White");

        room = new HotelRoom(0, 3, HotelRoom.roomTypeData.Normal);
        elderlyRoom = new HotelRoom(0, 2, HotelRoom.roomTypeData.Elderly);
        
        room.checkIn(p1);
        room.checkIn(p2);
        room.checkIn(p3);
        room.checkIn(p4);
    }
}