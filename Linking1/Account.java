package Linking1;

public class Account {
	String username;
	int password;
	movies[] m = new movies[4];

	Account(String username, int password) {
		this.username = username;
		this.password = password;
	}

	public movies[] addMovies(int size) {
		return new movies[size];
	}

	public String getAccountDetials() {
		return "Name " + username + " password " + password;
	}

}
