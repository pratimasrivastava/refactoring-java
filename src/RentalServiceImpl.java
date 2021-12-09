import java.util.HashMap;

public class RentalServiceImpl {

  public MovieRentedResult statement(Customer customer) {
    HashMap<String, Movie> movies = new HashMap();
    movies.put("F001", new Movie("You've Got Mail", "regular"));
    movies.put("F002", new Movie("Matrix", "regular"));
    movies.put("F003", new Movie("Cars", "childrens"));
    movies.put("F004", new Movie("Fast & Furious X", "new"));

    double totalAmount = 0;
    int frequentEnterPoints = 0;
      for (MovieRental r : customer.getRentedMovies()) {
            double thisAmount;

            switch (movies.get(r.getMovieId()).getMovieCode()) {
                case REGULAR:
                    thisAmount = 2;
                    if (r.getDays() > 2) {
                        thisAmount = ((r.getDays() - 2) * 1.5) + thisAmount;
                    }
                    break;

                case NEW:
                    thisAmount = r.getDays() * 3;
                    break;

                default:
                    thisAmount = 1.5;
                    if (r.getDays() > 3) {
                        thisAmount = ((r.getDays() - 3) * 1.5) + thisAmount;
                    }
                    break;
            }

      //add frequent bonus points
      frequentEnterPoints++;
      // add bonus for a two day new release rental
      if (movies.get(r.getMovieId()).getMovieCode() == "NEW" && r.getDays() > 2) frequentEnterPoints++;

      movies.get(r.getMovieId()).setAmount(thisAmount);
      totalAmount = totalAmount + thisAmount;
    }
    // add footer lines
   MovieRentedResult movieRentedResult = new MovieRentedResult(totalAmount, frequentEnterPoints, movies);
   return movieRentedResult;
  }
}
