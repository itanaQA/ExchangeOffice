package ExchangeOffice;

public class Dollar extends Currency {
    public Dollar(double course) {
        super("Dollar", "USD", course);
    }

    public void setNewCourse(double newCourse) {
        setCourse(newCourse);

    }


}
