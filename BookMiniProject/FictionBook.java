public class FictionBook extends Book {
    public FictionBook(string csvLine){
        super();
    }

    public override printInfo(){
        Book.printInfo();
        System.out.print(Edition);
    }
}
