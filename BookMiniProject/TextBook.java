public class TextBook extends Book {
    public TextBook(string csvLine){
        super();
    }

    public override printInfo(){
        Book.printInfo();
        System.out.print(Subject);
        System.out.print(Edition);
    }
}
