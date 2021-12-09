public class Movie {
    private String title;
    private String code;
    private double amount;

    public Movie(String title, String code,double amount) {

        this.title = title;
        this.code = code;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }
}
