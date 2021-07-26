
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> passing = new ArrayList<>();
        PointCalculator pointCalc = new PointCalculator();
        GradeDistributor gradeDist = new GradeDistributor();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            if (input < 0 || input > 100) {
                continue;
            }

            all.add(input);

            if (input >= 50) {
                passing.add(input);
            }
        }
        System.out.println("Point average (all): " + pointCalc.pointAverage(all));

        if (passing.isEmpty()) {
            System.out.println("Point average (passing): -");
        } else
        System.out.println("Point average (passing): " + pointCalc.pointAverage(passing));
        System.out.println("Pass percentage: " + 100.0 * passing.size() / all.size());
        System.out.println("Grade Distribution:");
        gradeDist.distributeGrades(all);
    }
}
