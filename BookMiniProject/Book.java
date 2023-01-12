public abstract class Book(){
    public String Title = "";
    public String Genre = "";
    public String Author = "";
    public String Subject = "";
    public int Edition = 0;

    public Book(String csvLine){
        //Process CSV Info Here
        String[] data = csvLine.split(',');
        for (int i = 0; i < data.length; i++){
            if (i == 0){
                //Title
                Title = data[i];
            }
            else if (i == 1){
                //Genre
                Genre = data[i];
            }
            else if (i == 2){
                //Author
                Author = data[i];
            }
            else if (i == 3){
                //Subject
                Subject = data[i];
            }
            else if (i == 4){
                //Edition
                Edition = Integer.parse(data[i]);
            }
        }
    }

    public abstract void printInfo(){
        System.out.print(Title);
        System.out.print(Author);
        System.out.print(Genre);
    }
}