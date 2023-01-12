public class NonfictionBook extends Book {
    public NonfictionBook(string csvLine){
        super();
    }

    public override printInfo(){
        Book.printInfo();
        System.out.print(Subject);
        System.out.print(Genre);
    }
}
