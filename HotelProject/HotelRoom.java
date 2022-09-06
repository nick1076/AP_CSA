public class HotelRoom{
    public Person guestOne = null;
    public Person guestTwo = null;
    public int roomNumber = 0;


    public static void main(String[] args){
        
    }

    public HotelRoom(int r){
        roomNumber = r;
    }

    public Boolean checkIn(Person guest){
        if (checkCapacity() == 2){
            System.out.println("Room is full!");
            return false;
        }
        else if (guestOne == null){
            System.out.println("Added guest to slot 1!");
            guestOne = guest;
        }
        else if (guestTwo == null){
            System.out.println("Added guest to slot 2!");
            guestTwo = guest;
        }

        return false;
    }

    public Boolean checkOut(Person guest){
        if (checkCapacity() == 0){
            System.out.println("Room is empty!");
            return false;
        }
        else if (guestOne != null){
            if (guestOne == guest){
                System.out.println("Removed guest from slot 1!");
                guestOne = null;
                return true;
            }
        }
        else if (guestTwo != null){
            if (guestTwo == guest){
                System.out.println("Removed guest from slot 2!");
                guestTwo = null;
                return true;
            }
        }

        return false;
    }

    public int checkCapacity(){
        if (guestOne != null && guestTwo != null){
            System.out.println("We have 2 guests in this room!");
            return 2;
        }
        else if (guestOne != null){
            System.out.println("We have 1 guest in this room!");
            return 1;
        }
        else if (guestTwo != null){
            System.out.println("We have 1 guest in this room!");
            return 1;
        }
        else{
            System.out.println("We have 0 guests in this room!");
            return 0;
        }
    }

    public void printGuestInfo(){
        if (guestOne != null){
            System.out.println("(Slot 1) Name: " + guestOne.name + ", Height: " + guestOne.height + ", Age: " + guestOne.age + ", Hair Color: " + guestOne.hairColor);
        }
        if (guestTwo != null){
            System.out.println("(Slot 2) Name: " + guestTwo.name + ", Height: " + guestTwo.height + ", Age: " + guestTwo.age + ", Hair Color: " + guestTwo.hairColor);
        }
    }
}