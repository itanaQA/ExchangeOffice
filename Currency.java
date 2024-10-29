package ExchangeOffice;

public class Currency {

    private String name;
    private String symbol;
    private double course;

    public Currency(String name, String symbol, double course) {
        this.name = name;
        this.symbol = symbol;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double convertToDinars(double amount) {
        return amount * course;

    }

    public String toString() {
        return name + symbol + course;
    }
}
