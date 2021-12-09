public class Movie {
    private String movieName;
    private String movieCode;
    private double amount;

    public Movie(String movieName, String movieCode,double amount) {

        this.movieName = movieName;
        this.movieCode = movieCode;
        this.amount = amount;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieCode() {
        return movieCode;
    }
     public String getAmount() {
        return amount;
    }
     public void setAmount(ouble amount) {
        this.amount = amount;
    }
}
