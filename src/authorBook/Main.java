package authorBook;

public class Main {

	public static void main(String[] args) {
		//test 
		
		Author author = new Author("Paul", "paulgmail.com",'M',true);
		Book newBook = new Book("Hannah",author,20,1);
		
		System.out.println(newBook.toString());

	}

}
