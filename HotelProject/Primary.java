public class Primary{

    static HotelRoom room;
    static HotelRoom elderlyRoom;

    public static void main(String[] args){
        Person p1 = new Person(5.4, 25, "John", "Brown");
        Person p2 = new Person(3.6, 34, "Bob", "Blond");

        room = new HotelRoom(0, HotelRoom.roomTypeData.Normal);
        elderlyRoom = new HotelRoom(0, HotelRoom.roomTypeData.Elderly);

        if (room.checkCapacity() == 0){
            room.checkIn(p1);
            room.checkIn(p2);
            room.printGuestInfo();
        }

        if (room.checkCapacity() == 2){
            room.checkOut(p1);
            room.checkOut(p2);
            room.printGuestInfo();
        }

        room.checkIn(p1);
        room.checkIn(p2);
        room.checkIn(new Person(4.2, 28, "Joe", "Black"));
        room.printGuestInfo();


        elderlyRoom.checkIn(new Person(4.2, 28, "Joe", "Black"));
        elderlyRoom.checkIn(new Person(4.2, 65, "Joe", "Black"));
    }
}