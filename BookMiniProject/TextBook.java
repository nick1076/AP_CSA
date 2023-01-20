public class TextBook extends Book {
    public TextBook(String[] data){
        super();
        Title = data[0];
        Genre = data[1];
        Author = data[2];
        Subject = data[3];
        Edition = Integer.valueOf(data[4]);
    }
}
