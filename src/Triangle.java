/**
 * Created by JeniaTr-SL on 02.06.2017.
 */
public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return a * b / 2;
    }
}
