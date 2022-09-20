public class HammerHeadShark extends Vertibrate{
    
    public String hammerHeadSharkAttributeTitle = "Shark Length";
    public int hammerHeadSharkLength;

    public HammerHeadShark(int hhsLength){
        super("Hammer Head Shark", "Chordata", "I am a Chordata shark", "Vertebrata", "I have a spine?", "Cartiligenious Fish", "I am made of cartilige");
        hammerHeadSharkLength = hhsLength;
    }

    public void Output(){
        System.out.println();
        System.out.println("Animal Name: " + animalName);
        System.out.println("Phyla Class: " + phylaClass);
        System.out.println("Phyla Attribute: " + phylaAttribute);
        System.out.println("Subphyla Class: " + subphylaClass);
        System.out.println("Subphyla Attribute: " + subphylaAttribute);
        System.out.println("Vertebrate Group: " + vertibrateGroup);
        System.out.println("Vertebrate Attribute: " + vertibrateAttribute);
        System.out.println("Animal-Specific Attribute (" + hammerHeadSharkAttributeTitle + "): " + hammerHeadSharkLength);
        System.out.println();
    }
}