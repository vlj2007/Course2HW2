public abstract class Wheels implements Transport {

    private String modelName;
    private int wheelsCount;

    public Wheels(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount(){
        return wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}