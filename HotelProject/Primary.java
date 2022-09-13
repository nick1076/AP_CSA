public class Primary{

    //Room variables
    static HotelRoom room;
    static HotelRoom elderlyRoom;

    //Tests for room types and capacity
    public static void main(String[] args){
        Person p1 = new Person(5.4, 25, "John", "Brown");
        Person p2 = new Person(3.6, 34, "Bob", "Blond");
        Person p3 = new Person(4.5, 22, "Joe", "White");
        Person p4 = new Person(4.5, 90, "Brian", "White");

        //Create a room with capacity for 3 people and of Normal type
        room = new HotelRoom(0, 3, HotelRoom.roomTypeData.Normal);

        //Create a room with capacity for 2 people and of Elderly type
        elderlyRoom = new HotelRoom(0, 2, HotelRoom.roomTypeData.Elderly);
        
        //Add people to rooms to test differet room types
        room.checkIn(p1);
        room.checkIn(p2);
        room.checkIn(p3);
        room.checkIn(p4);

        room.printGuestInfo();
    }
}