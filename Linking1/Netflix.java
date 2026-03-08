package Linking1;

public class Netflix {
	int rating;
	int size = 4;
	User[] u;
	movies[] m;

//Netflix(){
//	
//}
	Netflix() {
		u = new User[size];
		m = new movies[size];
	}

	Netflix(int size) {
		this.size = size;
		u = new User[size];
		m = new movies[size];
	}
//Netflix(int size,float imdp_rating){
//	m=new movies[size];
//}

//Netflix(User[] u){
//	for(User i:u) {
//		String name=sc.next();
//		String email=sc.next();
//		String dob=sc.next();
//		i=new User(name,email,dob);
//	}
//}
//Netflix(movies[] m){
//	for(movies i:m) {
//		String name=sc.next();
//		String language=sc.next();
//		int duration=sc.nextInt();
//		String genre=sc.next();
//		i=new movies(name,language,duration,genre);
//	}
//}

	public void addUser(User user, int index) {
		if (index >= 0 && index < size) {
			u[index] = user;
			index++;
//			System.out.println("Hello");
		}
		System.out.println(u[0]);

	}

	public void addMovies(movies movie, int index) {
		if (index >= 0 && index < size) {
//			System.out.println("Hello");
			m[index] = movie;
//		this.rating=rating;
			index++;
		}
		System.out.println(m[0]);
	}

	public void getDetails() {
		System.out.println(u[0]);
		for (User i : u) {
			if (i != null) {
				System.out.println(i.getUserDetials());
			}
		}
		for (movies j : m) {
			if (j != null) {
				System.out.println(j.getMovieDetails());
			}
		}
	}

}
