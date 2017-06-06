/**
 * Created by JeniaTr-SL on 02.06.2017.
 */
public interface Sound {
    String getType();

    default void getSound() {
        System.out.println("====");
    }
}
