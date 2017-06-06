
public class Cat implements Sound {

    String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void getSound() {
        System.out.println("Miau");

    }
}
