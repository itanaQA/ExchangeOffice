package ExchangeOffice;

public class Euro extends Currency {
    public Euro(double course) {
        super("Euro", "EUR", course);

    }

    public void setNewCourse(double newCourse) {
        setCourse(newCourse);
    }

}
