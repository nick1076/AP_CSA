public class Primary{

    static HotelRoom room;

    public static void main(String[] args){
        Person p1 = new Person(5.4, 25, "John", "Brown");
        Person p2 = new Person(3.6, 34, "Bob", "Blond");

        room = new HotelRoom(0);

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
    }
}