public interface Transport {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
