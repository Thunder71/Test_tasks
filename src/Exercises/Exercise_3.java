package Exercises;

import javafx.css.Match;

import java.util.Scanner;

public class Exercise_3 {
    public  void solve() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание 3");
        System.out.println("\nВведите координаты первого отрезка:");
        System.out.println("Введите число ax1");
        double ax1 = in.nextInt();
        System.out.println("Введите число ay1");
        double ay1 = in.nextInt();
        System.out.println("Введите число ax2");
        double ax2 = in.nextInt();
        System.out.println("Введите число ay2");
        double ay2 = in.nextInt();
        System.out.println("\nВведите координаты второго отрезка:");
        System.out.println("Введите число bx1");
        double bx1 = in.nextInt();
        System.out.println("Введите число by1");
        double by1 = in.nextInt();
        System.out.println("Введите число bx2");
        double bx2 = in.nextInt();
        System.out.println("Введите число by2");
        double by2 = in.nextInt();

        Point p1 = new Point(ax1, ay1);
        Point p2 = new Point(ax2, ay2);
        Point p3 = new Point(bx1, by1);
        Point p4 = new Point(bx2, by2);

        boolean q = checkIntersection(p1,p2,p3,p4);
        System.out.println(q);

    }

    private boolean checkIntersection(Point p1, Point p2, Point p3, Point p4) {
        if (p2.x < p1.x) {

            Point v1 = p1;

            p1 = p2;

            p2 = v1;
        }

        if (p4.x < p3.x) {

            Point v2 = p3;

            p3 = p4;

            p4 = v2;
        }

        if (p2.x < p3.x) {

            return false;
        }

        if ((p1.x - p2.x == 0) && (p3.x - p4.x == 0)) {

            if (p1.x == p3.x) {

                if (!((Math.max(p1.y, p2.y) < Math.min(p3.y, p4.y)) || (Math.min(p1.y, p2.y) > Math.max(p3.y, p4.y)))) {

                    return true;
                }
            }
            return false;
        }

        if (p1.x - p2.x == 0) {

            double Xa = p1.x;

            double A2 = (p3.y - p4.y) / (p3.x - p4.x);

            double b2 = p3.y - A2 * p3.x;

            double Ya = A2 * Xa + b2;

            if (p3.x <= Xa && p4.x >= Xa && Math.min(p1.y, p2.y) <= Ya && Math.max(p1.y, p2.y) >= Ya) {

                return true;
            }
            return false;
        }

        if (p3.x - p4.x == 0) {

            double Xa = p3.x;

            double A1 = (p1.y - p2.y) / (p1.x - p2.x);

            double b1 = p1.y - A1 * p1.x;

            double Ya = A1 * Xa + b1;

            if (p1.x <= Xa && p2.x >= Xa && Math.min(p3.y, p4.y) <= Ya &&

                    Math.max(p3.y, p4.y) >= Ya) {

                return true;
            }
            return false;
        }

        double A1 = (p1.y - p2.y) / (p1.x - p2.x);

        double A2 = (p3.y - p4.y) / (p3.x - p4.x);

        double b1 = p1.y - A1 * p1.x;

        double b2 = p3.y - A2 * p3.x;

        if (A1 == A2) {

            return false;
        }

        double Xa = (b2 - b1) / (A1 - A2);

        if ((Xa < Math.max(p1.x, p3.x)) || (Xa > Math.min(p2.x, p4.x))) {

            return false;

        } else {

            return true;
        }

    }
}
