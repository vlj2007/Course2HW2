public class Truck extends Motor {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        if (this != null) {
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }
}