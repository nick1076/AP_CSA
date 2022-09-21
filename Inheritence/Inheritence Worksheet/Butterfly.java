public class Butterfly extends Invertibrate{
    
    public String butterflyAttributeTitle = "Butterfly Wing Length";
    public int butterflyWingLength;

    public Butterfly(int bWingLength){
        super("Butterfly", "Arthropoda", "I am in the Arthropoda family", "Crustaceans", "I am part of the Crustaceans Subphyla apparently", "Insects", "I have nice wings");
        butterflyWingLength = bWingLength;
    }

    public void Output(){
        System.out.println();
        System.out.println("Animal Name: " + animalName);
        System.out.println("Phyla Class: " + phylaClass);
        System.out.println("Phyla Attribute: " + phylaAttribute);
        System.out.println("Subphyla Class: " + subphylaClass);
        System.out.println("Subphyla Attribute: " + subphylaAttribute);
        System.out.println("Invertebrate Group: " + invertibrateGroup);
        System.out.println("Invertebrate Attribute: " + invertibrateAttribute);
        System.out.println("Animal-Specific Attribute (" + butterflyAttributeTitle + "): " + butterflyWingLength);
        System.out.println();
    }

}