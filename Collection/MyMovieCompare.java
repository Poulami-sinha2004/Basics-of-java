package Collection;

import java.util.Comparator;

public class MyMovieCompare implements Comparator<Movie> {
public int compare(Movie m1,Movie m2) {
	if(m1.rating>m2.rating) {
		return 1;
	}
	else if(m2.rating>m1.rating) {
		return -1;
	}
	
	return 0;
}
}
