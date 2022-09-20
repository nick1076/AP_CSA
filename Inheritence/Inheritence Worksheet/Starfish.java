public class Starfish extends Invertibrate{

    public String starfishAttributeTitle = "Starfish Width";
    public int starfishWidth;

    public Starfish(int sfWidth){
        super("Starfish", "Echinodermata", "I am in the Starfish/Sea Urchin family", "NONE", "I am not part of a Subphyla", "Starfish", "I am my own category of Invertibrate");
        starfishWidth = sfWidth;
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
        System.out.println("Animal-Specific Attribute (" + starfishAttributeTitle + "): " + starfishWidth);
        System.out.println();
    }

}