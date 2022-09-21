public class Kangaroo extends Vertibrate{

    public String kangarooAttributeTitle = "Kangaroo Babies";
    public int kangarooBabies;

    public Kangaroo(int kBabies){
        super("Kangaroo", "Chordata", "I am a Chordata mammal", "Vertebrata", "I have bones", "Mammals", "I am a mammal");
        kangarooBabies = kBabies;
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
        System.out.println("Animal-Specific Attribute (" + kangarooAttributeTitle + "): " + kangarooBabies);
        System.out.println();
    }
}