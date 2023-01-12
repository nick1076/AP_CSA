public class Main(){
    public static void main(String[] args){

        BookList books = new BookList();
        File myFile = new File("./csv.txt");
        Scanner myScanner = new Scanner(myFile);
        
        String line = "";
        int lineCount = 0;
        
		while(myScanner.hasNextLine()){
			line = myScanner.nextLine();
            if (lineCount != 0){
                books.add(new Book(line));
            }
            lineCount++;
		}

        books.printTable();
    }
}