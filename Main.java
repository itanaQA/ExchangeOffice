package ExchangeOffice;

public class Main {
    public static void main(String[] args) {


        Currency d = new Dollar(100.0);
        Currency e = new Euro(120.0);


        System.out.println(d.convertToDinars(150));
        System.out.println(e.convertToDinars(150));
    }
}