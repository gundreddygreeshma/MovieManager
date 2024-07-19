import java.util.List;

public class Movie {
	String movieName;
	int yearOfRelease;
	List <String> genre;
	
	public Movie(String movieName, int yearOfRelease, List <String>genre){
		this.movieName = movieName;
		this.yearOfRelease = yearOfRelease;
		this.genre = genre;
	}
	
	
}