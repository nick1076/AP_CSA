public class Vertibrate extends Subphyla{

    public String vertibrateGroup = "";
    public String vertibrateAttribute = "";

    public Vertibrate(String aName, String pClass, String pAttribute, String sClass, String sAttribute, String vGroup, String vAttribute){
        super(aName, pClass, pAttribute, sClass, sAttribute);
        vertibrateGroup = vGroup;
        vertibrateAttribute = vAttribute;
    }
}