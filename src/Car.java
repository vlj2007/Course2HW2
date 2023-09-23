public class Car extends Motor {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        if (this != null) {
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }
}