public class Kangaroo extends Mammal{

    public int kangarooJumpHeight;
    
    public Kangaroo(String aName, int vBones, int mSpeed, int kJumpHeight){
        super(aName, vBones, mSpeed);
        kangarooJumpHeight = kJumpHeight;
    }

    public void PrintAttributes(){
        System.out.println("I am a " + animalName + ", I have " + vertebrateAmountOfBones + " bones, I have a speed of " + mammalSpeed + " and I currently have a jump height of " + kangarooJumpHeight + " feet.");
    }
}