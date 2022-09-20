public class Invertibrate extends Subphyla{

    public String invertibrateGroup = "";
    public String invertibrateAttribute = "";

    public Invertibrate(String aName, String pClass, String pAttribute, String sClass, String sAttribute, String iGroup, String iAttribute){
        super(aName, pClass, pAttribute, sClass, sAttribute);
        invertibrateGroup = iGroup;
        invertibrateAttribute = iAttribute;
    }
}