import java.util.List;

public class Customer {
    private String customerName;
    private List<MovieRental> rentedMovies;

    public Customer(String customerName, List<MovieRental> rentedMovies) {
        this.customerName = customerName;
        this.rentedMovies = rentedMovies;
    }

    public String getCustomerNamee() {
        return customerName;
    }

    public List<MovieRental> getRentedMovies() {
        return rentedMovies;
    }
}
