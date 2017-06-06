/**
 * Created by JeniaTr-SL on 02.06.2017.
 */
public class Pickup implements PassengersAuto, CargoAuto {

    @Override
    public void transportPassengers() {
        System.out.println("Везу груз");
    }

    @Override
    public void transportCargo() {
        System.out.println("Везу пасажыров");

    }
}
