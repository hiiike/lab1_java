package Task11;

public class Main {

    public static void main(final String[] args) {
        final Driver[] drivers = new Driver[3];

        drivers[0] = new Driver("Roman", "Alexeev",2);
        drivers[1] = new Driver("Evgen", "Koval",4);
        drivers[2] = new Driver("Igor", "James",15);

        final Taxi taxiCar = new Taxi("Mercedez", 4,drivers);

        final Client clients = new Client("Denys","Boichuk",21,"0680748193");
        final Order order = new Order( 1,150,3,taxiCar,clients);

        System.out.println(order.toString());
    }

}
