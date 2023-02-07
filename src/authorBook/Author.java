package authorBook;

public class Author {
	
	private String name;
	
	private String email;
	
	private char gender;
	
	private boolean isMale;

	
	//constructor default
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Author(String name, String email, char gender,Boolean isMale) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.isMale = isMale;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	

}
