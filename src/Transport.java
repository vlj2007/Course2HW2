public interface Transport {

    void service();

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
