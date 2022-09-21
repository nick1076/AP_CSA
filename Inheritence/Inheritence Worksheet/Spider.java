public class Spider extends Invertibrate{

    public String spiderAttributeTitle = "Spider Legs";
    public int spiderLegs;

    public Spider(int sLegs){
        super("Spider", "Arthropoda", "I am in the Arthropoda family", "Chelicerates", "I am part of the Chelicerates Subphyla with Spiders/Scorpions", "Spdiers/Scorpians", "I have many legs");
        spiderLegs = sLegs;
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
        System.out.println("Animal-Specific Attribute (" + spiderAttributeTitle + "): " + spiderLegs);
        System.out.println();
    }

}