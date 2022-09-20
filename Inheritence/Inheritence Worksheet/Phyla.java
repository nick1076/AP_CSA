public class Phyla extends AnimalKingdom{

    public String phylaClass = "";
    public String phylaAttribute = "";

    public Phyla(String aName, String pClass, String pAttribute){
        super(aName);
        phylaClass = pClass;
        phylaAttribute = pAttribute;
    }
}