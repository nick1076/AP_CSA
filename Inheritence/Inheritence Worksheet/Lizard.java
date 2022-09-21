public class Lizard extends Vertibrate{

    public String lizardAttributeTitle = "Lizard Tail Length";
    public int lizardTailLength;

    public Lizard (int lTailLength){
        super("Lizard", "Chordata", "I am a Chordata lizard", "Vertebrata", "I have bones", "Reptiles", "I am a reptile");
        lizardTailLength = lTailLength;
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
        System.out.println("Animal-Specific Attribute (" + lizardAttributeTitle + "): " + lizardTailLength);
        System.out.println();
    }
}