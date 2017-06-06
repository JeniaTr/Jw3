
public class Main {
    public static void main(String[] args) {
        Sound cat = new Cat();
        cat.getSound();

        Pickup pickup = new Pickup();
        pickup.transportCargo();
        pickup.transportPassengers();

        System.out.println();
        Sedan sedan =new Sedan();
        sedan.transportPassengers();
    }
}
