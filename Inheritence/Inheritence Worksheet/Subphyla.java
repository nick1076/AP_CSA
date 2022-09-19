public class Subphyla extends Phyla{

    public String subphylaClass = "";

    public Subphyla(String aName, String pClass, String sClass){
        super(aName, pClass);
        subphylaClass = sClass;
    }
}