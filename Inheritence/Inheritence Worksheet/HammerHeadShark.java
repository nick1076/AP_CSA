public class HammerHeadShark extends Vertibrate{
    
    public String hammerHeadSharkAttributeTitle = "Shark Length";
    public int hammerHeadSharkLength;

    public HammerHeadShark(int hhsLength){
        super("Hammer Head Shark", "Chordata", "Vertebrata", "Cartiligenious Fish");
        hammerHeadSharkLength = hhsLength;
    }

    public void Output(){
        System.out.println("Animal Name: " + animalName);
        System.out.println("Phyla Class: " + phylaClass);
        System.out.println("Subphyla Class: " + subphylaClass);
        System.out.println("Vertibrata Group: " + vertibrateGroup);
        System.out.println("Specific Attribute (" + hammerHeadSharkAttributeTitle + "): " + hammerHeadSharkLength);
    }
}