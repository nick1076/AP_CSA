public class HorseshoeCrab extends Invertibrate{

    public String horseshoeCrabAttributeTitle = "Horseshoe Crab Length";
    public int horseshoeCrabLength;

    public HorseshoeCrab(int hscLength){
        super("Horseshoe Crab", "Arthropoda", "I am in the Arthropoda family", "Chelicerates", "I am part of the Chelicerates Subphyla with Spiders/Scorpions", "Horseshoe Crabs", "I have a hard shell");
        horseshoeCrabLength = hscLength;
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
        System.out.println("Animal-Specific Attribute (" + horseshoeCrabAttributeTitle + "): " + horseshoeCrabLength);
        System.out.println();
    }

}