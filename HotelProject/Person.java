public class Person{

    //Information for each person
    public double height = 0;
    public int age = 0;
    public String name = "";
    public String hairColor = "";

    //Empty constructor so parameters aren't required
    public Person(){
        
    }

    //Constructer with all parameters
    public Person(double h, int a, String n, String hC){
        //Assign passed paremets to local variables
        height = h;
        age = a;
        name = n;
        hairColor = hC;
    }
}