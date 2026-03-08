package Collection;

public class Movie{
int id;
String name;
double rating;

public Movie(int id,String name,double rating) {
	this.id=id;
	this.name=name;
	this.rating=rating;
}

@Override
public String toString() {
	return "\nID: " + id + "\nName: " + name + "\nRating: " + rating + "\n";
}
}
