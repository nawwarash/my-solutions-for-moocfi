import java.util.ArrayList;

public class PointCalculator {

    public PointCalculator() {
    }

    public double pointAverage(ArrayList<Integer> points) {
        int sum = 0;
        int avg = 0;
        int i = 0;
        for (int tempPoint : points) {
            sum += tempPoint;
            i++;
        }
        return sum / i * 1.0;
    }

}
