public class NonfictionBook extends Book {
    public NonfictionBook(String[] data){
        super();
        Title = data[0];
        Genre = data[1];
        Author = data[2];
        Edition = Integer.valueOf(data[3]);
    }
}
