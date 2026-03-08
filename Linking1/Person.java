package Linking1;

public class Person {
	public static void main(String[] args) {
//	Netflix n= new Netflix();
		Netflix n1 = new Netflix(2);

		Subscription s = new Subscription(1221, "12/12/12", 3);

		movies m = new movies("zindage", "hindi", 2, "horror");

		User u = new User("polu", "polu123@gmail.com", "6/6/12", s, m);
		System.out.println(m.getMovieDetails());
		n1.addUser(u, 0);
		n1.addMovies(m, 0);
		n1.getDetails();
		s.getDetails();

	}
}
