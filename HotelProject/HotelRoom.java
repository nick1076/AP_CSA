
//Import namespaces to allow the use of lists and arrays
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Define hotel room class
public class HotelRoom{

    //Define hotel room variables, here are the initial two guests
    public Person guestOne = null;
    public Person guestTwo = null;

    //Define a list of people in case the room capacity exceeds two
    public List<Person> additionalGuests = new ArrayList<Person>();

    //Room number for the hotel room
    public int roomNumber = 0;

    //Capacity for the current room
    public int roomCapacity = 2;

    //Define an enum data type for the type of room
    public enum roomTypeData {
        Normal,
        Elderly
    }

    //Create a variable of that enum type for the type of room
    public roomTypeData roomType = roomTypeData.Normal;

    //Create bare constructor for the basic hotel room type
    public HotelRoom(int r){
        roomNumber = r;
    }

    //Constructor allowing capacity and room type to be defined
    public HotelRoom(int r, int rCapacity, roomTypeData rType){
        roomNumber = r;
        roomCapacity = rCapacity;
        roomType = rType;
    }

    //Function to check people in that returns a bool of if they were checked in or not
    public Boolean checkIn(Person guest){

        //Check to see if room is full before proceeding
        if (checkCapacity() == roomCapacity){
            System.out.println("Room is full!");
            return false;
        }

        //Check if the room can hold more than two people
        if (roomCapacity >2){

            //Check guest's age and if the room type only allows a certain age
            if (guest.age < 60 && roomType == roomTypeData.Elderly){
                System.out.println("Guest is to young for the elderly suite!");
                return false;
            }

            //Check if the first guest slot is empy
            if (guestOne == null){
                System.out.println("Added guest to slot 1!");
                guestOne = guest;
                return true;
            }

            //Check if the second guest slot is empy
            else if (guestTwo == null){
                System.out.println("Added guest to slot 2!");
                guestTwo = guest;
                return true;
            }

            //If neither of the first two are avaliable we add the guest to the extra guest list
            else{
                additionalGuests.add(guest);
                System.out.println("Added guest to the additional room list!");
                return true;
            }
        }
        
        //If room capacity is capped at two, start by checking what type of room we have
        if (roomType == roomTypeData.Normal){

            //Check if the first guest slot is open
            if (guestOne == null){
                System.out.println("Added guest to slot 1!");
                guestOne = guest;
                    return true;
            }

            //Check if the second guest slot is open
            else if (guestTwo == null){
                System.out.println("Added guest to slot 2!");
                guestTwo = guest;
                    return true;
            }
        }

        //Check if the room is set to elderly only
        else if (roomType == roomTypeData.Elderly){

            //Check if so that the guest is of that age
            if (guest.age >= 60){

                //Check if the first guest slot is open if so
                if (guestOne == null){
                    System.out.println("Added elderly guest to slot 1!");
                    guestOne = guest;
                    return true;
                }

                //Check if the second guest slot is open if so
                else if (guestTwo == null){
                    System.out.println("Added elderly guest to slot 2!");
                    guestTwo = guest;
                    return true;
                }
            }

            //Otherwise guest is too young for the elderly room
            else{
                System.out.println("Guest is too young for the elderly suite!");
                return false;
            }
        }

        //Catch all
        return false;
    }

    //Attempt to check out a guest and return a bool based on the outcome
    public Boolean checkOut(Person guest){

        //Check if there are even any guests in this room
        if (checkCapacity() == 0){
            System.out.println("Room is empty!");
            return false;
        }

        //Check if the first guest slot has a guest
        if (guestOne != null){

            //If so, check if that guest is the same as the one we are trying to remove
            if (guestOne == guest){
                System.out.println("Removed guest from slot 1!");
                guestOne = null;
                return true;
            }
        }

        //Check if the second guest slot has a guest
        if (guestTwo != null){

            //If so, check if that guest is the same as the one we are trying to remove
            if (guestTwo == guest){
                System.out.println("Removed guest from slot 2!");
                guestTwo = null;
                return true;
            }
        }

        //Go through each additional guest
        for (int i = 0; i < additionalGuests.size(); i++){

            //See if this additional guest is the same as the one we are trying to remove
            if (additionalGuests.get(i) == guest){
                additionalGuests.remove(guest);
                System.out.println("Removed guest additional guest list!");
                return true;
            }
        }

        //Catch all
        return false;
    }

    //Function to return the amount of people currently in the room
    public int checkCapacity(){

        //Check if we need to check the additional guest list or not
        if (roomCapacity > 2){

            //Define a new integer to track the guest count (which will later be returned)
            int currentGuestCount = 0;

            //If the first guest exists, add 1 to the currentGuestCount
            if (guestOne != null){
                currentGuestCount += 1;
            }

            //If the second guest exists, add 1 to the currentGuestCount
            if (guestTwo != null){
                currentGuestCount += 1;
            }

            //Finally, add the length of the additional guest list to the currentGuestList
            currentGuestCount += additionalGuests.size();

            //Return the currentGuestCount as the capacity
            return currentGuestCount;
        }

        //If we are ignoring the additional guest list, then just check each possible out come and return the suitable value based off of what returns true
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

    //Method to print out the info of each guest
    public void printGuestInfo(){
        
        //Check if the guest in slot one exists
        if (guestOne != null){

            //If so, print their information
            System.out.println("(Slot 1) Name: " + guestOne.name + ", Height: " + guestOne.height + ", Age: " + guestOne.age + ", Hair Color: " + guestOne.hairColor);
        }
        
        //Check if the guest in slot two exists
        if (guestTwo != null){

            //If so, print their information
            System.out.println("(Slot 2) Name: " + guestTwo.name + ", Height: " + guestTwo.height + ", Age: " + guestTwo.age + ", Hair Color: " + guestTwo.hairColor);
        }

        //Go through each additional guest
        for (int i = 0; i < additionalGuests.size(); i++){

            //Print the current iterated guest's information
            System.out.println("(Additional Slot " + i + ") Name: " + additionalGuests.get(i).name + ", Height: " + additionalGuests.get(i).height + ", Age: " + additionalGuests.get(i).age + ", Hair Color: " + additionalGuests.get(i).hairColor);
        }
    }
}