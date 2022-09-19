public class Cardinal extends Bird{

    public int cardinalCurrentWorms;

    public Bird(String aName, int vBones, int mSpeed, int cWorms){
        super(aName, vBones, mSpeed);
        cardinalCurrentWorms = cWorms;
    }

    public void PrintAttributes(){
        System.out.println("I am a " + animalName + ", I have " + vertebrateAmountOfBones + " bones, I have a speed of " + birdFlySpeed + " and I currently have " + cardinalCurrentWorms + " worms.");
    }
}