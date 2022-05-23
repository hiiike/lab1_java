package Task11;

public class Order {
    private int orderNumber;
    private int price;
    private int countOfPassengers;
    private Taxi taxiCar;
    private Client client;

    public Order(final int orderNumber, final int price, final int countOfPassengers, final Taxi taxiCar, final Client client) {
        this.orderNumber = orderNumber;
        this.price = price;
        this.countOfPassengers = countOfPassengers;
        this.taxiCar = taxiCar;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(final int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public Taxi getTaxiCar() {
        return taxiCar;
    }

    public void setTaxiCar(final Taxi taxiCar) {
        this.taxiCar = taxiCar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", price=" + price +
                ", countOfPassengers=" + countOfPassengers +
                ", taxiCar=" + taxiCar.toString() +
                ", client=" + client.toString() +
                '}';
    }
}
