package model;

public class Author {
	private int authorID;
	private String name;
	private int age;
	private String country;
	public Author() {
		super();
	}
	public Author(int authorID, String name, int age, String country) {
		super();
		this.authorID = authorID;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
