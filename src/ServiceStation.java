public class ServiceStation {
    public void service(Transport transport) {
        if (transport instanceof Car) {
            System.out.println("Обслуживаем " + ((Car) transport).getModelName());
            ((Car) transport).service();
            ((Car) transport).checkEngine();
        } else if (transport instanceof Truck) {
            System.out.println("Обслуживаем " + ((Truck) transport).getModelName());
            ((Truck) transport).service();
            ((Truck) transport).checkEngine();
            ((Truck) transport).checkTrailer();
        } else if (transport instanceof Bicycle) {
            System.out.println("Обслуживаем " + ((Bicycle) transport).getModelName());
            ((Bicycle) transport).service();
        }
    }
}