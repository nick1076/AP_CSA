public class Mammal extends Vertebrata{
    
    public int mammalSpeed;

    public Mammal(String aName, int vBones, int mSpeed){
        super(aName, vBones);
        mammalSpeed = mSpeed;
    }
}