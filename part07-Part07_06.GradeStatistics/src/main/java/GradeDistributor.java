import java.util.ArrayList;
import java.util.Arrays;

public class GradeDistributor {
    ArrayList<String> under50;
    ArrayList<String> under60;
    ArrayList<String> under70;
    ArrayList<String> under80;
    ArrayList<String> under90;
    ArrayList<String> over90;
    public GradeDistributor() {
        this.under50 = new ArrayList<>();
        this.under60 = new ArrayList<>();
        this.under70 = new ArrayList<>();
        this.under80 = new ArrayList<>();
        this.under90 = new ArrayList<>();
        this.over90 = new ArrayList<>();
    }

    public void distributeGrades(ArrayList<Integer> points) {
        for (int point : points) {
            if (point < 50) {
                under50.add("*");
            } else if (point < 60) {
                under60.add("*");
            } else if (point < 70) {
                under70.add("*");
            } else if (point < 80) {
                under80.add("*");
            } else if (point < 90) {
                under90.add("*");
            } else {
                over90.add("*");
            }
        }

        System.out.print("5: ");
        over90.forEach(System.out::print);
        System.out.println("");

        System.out.print("4: ");
        under90.forEach(System.out::print);
        System.out.println("");

        System.out.print("3: ");
        under80.forEach(System.out::print);
        System.out.println("");

        System.out.print("2: ");
        under70.forEach(System.out::print);
        System.out.println("");

        System.out.print("1: ");
        under60.forEach(System.out::print);
        System.out.println("");

        System.out.print("0: ");
        under50.forEach(System.out::print);
        System.out.println("");
    }
}
