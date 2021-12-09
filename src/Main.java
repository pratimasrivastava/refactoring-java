import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    RentalServiceImpl  result = new RentalServiceImpl ().statement(new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1))));
    HashMap<String, Movie> movieMap = result.getMovieMap();
    if (!movieMap.get(F001).getMovieName().equals("You've Got Mail")) {
      throw new AssertionError("Expected Movie Name: You've Got Mail"+movieMap.get(F001).getMovieName());
    }
    
    if (!movieMap.get(F002).getMovieName().equals("Matrix")) {
      throw new AssertionError("Expected Movie Name: Matrix"+movieMap.get(F001).getMovieName());
    }

    System.out.println("Success");
  }
}
