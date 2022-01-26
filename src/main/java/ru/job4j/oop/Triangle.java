package ru.job4j.oop;

import static java.lang.Math.sqrt;

    public class Triangle {
        private Point first;
        private Point second;
        private Point third;

        public Triangle(Point ap, Point bp, Point cp) {
            this.first = ap;
            this.second = bp;
            this.third = cp;
        }

        public double semiPerimeter(double a, double b, double c) {
            return (a + b + c) / 2;
        }

        public boolean exist(double ab, double ac, double bc) {
            return (ab + ac > bc && ab + bc > ac && ac + bc > ab);
        }

        public double area() {
            double rsl = -1;
            double ab = first.distance(second);
            double ac = first.distance(third);
            double bc = second.distance(third);
            double p = semiPerimeter(ab, ac, bc);
            if (this.exist(ab, ac, bc)) {
                rsl = sqrt(p * (p - ab) * (p - ac) * (p - bc));
            }
            return rsl;
        }

        public static void main(String[] args) {
            Point a = new Point(8, 5);
            Point b = new Point(2, 1);
            Point c = new Point(8, 1);
            Triangle triangle = new Triangle(a, b, c);
            double rsl = triangle.area();
            System.out.println(rsl);
        }
    }