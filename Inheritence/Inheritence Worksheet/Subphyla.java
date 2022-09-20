public class Subphyla extends Phyla{

    public String subphylaClass = "";
    public String subphylaAttribute = "";

    public Subphyla(String aName, String pClass, String pAttribute, String sClass, String sAttribute){
        super(aName, pClass, pAttribute);
        subphylaClass = sClass;
        subphylaAttribute = sAttribute;
    }
}