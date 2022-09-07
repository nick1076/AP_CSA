public class HotelRoom{
    public Person guestOne = null;
    public Person guestTwo = null;
    public List<Person> additionalGuests = new List<Person>();
    public int roomNumber = 0;
    public int roomCapacity = 0;

    public enum roomTypeData {
        Normal,
        Elderly
    }
    public roomTypeData roomType;

    public HotelRoom(int r, int rCapacity, roomTypeData rType){
        roomNumber = r;
        roomCapacity = rCapacity;
        roomType = rType;
    }

    public Boolean checkIn(Person guest){

        if (roomCapacity >2){
            if (guest.age < 60 && roomType == roomTypeData.roomType.Elderly){
                System.out.println("Guest is to young for the elderly suite!");
                return false;
            }

            if (guestOne == null){
                System.out.println("Added guest to slot 1!");
                guestOne = guest;
                return true;
            }
            else if (guestTwo == null){
                System.out.println("Added guest to slot 2!");
                guestTwo = guest;
                return true;
            }
            else{
                if (additionalGuests.size() < rCapacity){
                    additionalGuests.Add(guest);
                    System.out.println("Added guest to the additional room list!");
                    return true;
                }
                else{
                    System.out.println("Room is full!");
                    return false;
                }
            }

            return false;
        }



        if (roomType == roomTypeData.Normal){
            if (checkCapacity() == 2){
                System.out.println("Room is full!");
                return false;
            }
            else if (guestOne == null){
                System.out.println("Added guest to slot 1!");
                guestOne = guest;
                    return true;
            }
            else if (guestTwo == null){
                System.out.println("Added guest to slot 2!");
                guestTwo = guest;
                    return true;
            }
        }
        else if (roomType == roomTypeData.Elderly){
            if (guest.age >= 60){
                if (checkCapacity() == 2){
                    System.out.println("Room is full, cannot add elderly guest!");
                    return false;
                }
                else if (guestOne == null){
                    System.out.println("Added elderly guest to slot 1!");
                    guestOne = guest;
                    return true;
                }
                else if (guestTwo == null){
                    System.out.println("Added elderly guest to slot 2!");
                    guestTwo = guest;
                    return true;
                }
            }
            else{
                if (checkCapacity() == 2){
                    System.out.println("Guest is not eligable for the elderly suite, and the room is full!");
                    return false;
                }
                System.out.println("Guest is too young for the elderly suite!");
                return false;
            }
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

        if (roomCapacity > 2){
            int currentGuestCount = 0;

            if (guestOne != null){
                currentGuestCount += 1;
            }
            if (guestTwo != null){
                currentGuestCount += 1;
            }

            currentGuestCount += additionalGuests.size();

            return currentGuestCount;
        }



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