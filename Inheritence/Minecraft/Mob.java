public class Mob{
    String name;
    int health;

    public Mob(String name_p, int health_p){
        name = name_p;
        health = health_p;
    }

    public void PrintAttributes(){
        print("I am a " + name + " with " + health + " health.")
    }
}