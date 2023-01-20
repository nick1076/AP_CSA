public abstract class Book{
    public String Title = "";
    public String Genre = "";
    public String Author = "";
    public String Subject = "";
    public int Edition = 0;

    public void printInfo(){
        System.out.print(" ");

        if (Title == ""){
            System.out.print("n/a");
            System.out.print(" | ");
        }
        else{
            System.out.print(Title);
            System.out.print(" | ");
        }

        if (Genre == ""){
            System.out.print("n/a");
            System.out.print(" | ");
        }
        else{
            System.out.print(Genre);
            System.out.print(" | ");
        }

        if (Author == ""){
            System.out.print("n/a");
            System.out.print(" | ");
        }
        else{
            System.out.print(Author);
            System.out.print(" | ");
        }

        if (Subject == ""){
            System.out.print("n/a");
            System.out.print(" | ");
        }
        else{
            System.out.print(Subject);
            System.out.print(" | ");
        }

        System.out.print(Edition);
        System.out.print(" ");
    }
}