public class TextBook extends Book {
    public TextBook(String[] data){
        super();
        Title = data[0];
        Genre = data[1];
        Author = data[2];
        Subject = data[3];
        Edition = Integer.valueOf(data[4]);
    }

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
