public class FictionBook extends Book {
    public FictionBook(String[] data){
        super();
        Title = data[0];
        Genre = data[1];
        Author = data[2];
        Edition = Integer.valueOf(data[4]);
    }
}
