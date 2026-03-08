package Linking1;

public class movies {
	String name;
	String language;
	double duration;
	String genre;

	movies(String name, String language, double duration, String genre) {
		this.name = name;
		this.language = language;
		this.duration = duration;
		this.genre = genre;

	}

	public String getMovieDetails() {
		return "name " + name + " language " + language + " duration " + duration + " genre " + genre;
	}
}
