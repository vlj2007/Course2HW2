//import com.sun.jdi.connect.spi.TransportService;

public class Main {
    public static void main(String[] args) {

        Transport[] transport = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < transport.length; i++) {
            station.service(transport[i]);
        }
    }
}