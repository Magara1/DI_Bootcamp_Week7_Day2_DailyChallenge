package authorBook;

public class Book {
	
	//class attributes
	
	private String name;
	
	private Author author;
	
	private double price;
	
	private int qty;
	
	//constructor 
	
		public Book(String name, Author author, double price, int qty) {
			super();
			this.name = name;
			this.author = author;
			this.price = price;
			this.qty = qty;
		}
		
		
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
	

	
	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " by " + author.toString();
	}
	
	
	
	

	
	
	
	
	

}
