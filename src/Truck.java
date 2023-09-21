public class Truck extends Motor implements Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}