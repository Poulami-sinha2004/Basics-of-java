package Linking1;

public class User {
	String name;
	String email;
	String dob;
	Subscription sc;
	movies m;

	public User(String name, String email, String dob, Subscription sc, movies m) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.sc = sc;
		this.m = m;

	}

	public User(String name, String email, String dob, Subscription sc) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.sc = sc;
	}

	public String getUserDetials() {
		return "Name " + name + " email " + email + " dob " + dob + " " + sc.getDetails() + m.getMovieDetails();

	}
}
