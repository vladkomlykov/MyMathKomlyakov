package org.example;

public class Trigonometry {

    public static double pintSin(double corner) {
        corner = corner * Constants.PI / 180;
        double sin = corner - (pow(corner, 3) / 6) + (pow(corner, 5) / 120) - (pow(corner, 7) / 5040) + (pow(corner, 9) / 362880);
        return sin;

    }

    public static double pow(double corner, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * corner;
        }
        return result;
    }

    public static double printCos(double corner) {
        corner = corner * Constants.PI / 180;
        double cos = 1 - (pow(corner, 2) / 2) + (pow(corner, 4) / 24) - (pow(corner, 6) / 720) + (pow(corner, 8) / 40320);
        return cos;

    }

    public static double printTg(double corner) {
        corner = corner * Constants.PI / 180;
        double tg = corner + (pow(corner,3)/3) + (2*(pow(corner,5))/15) + (17*(pow(corner,7))/315) + (62*(pow(corner,9))/2835);
        return tg;
    }

    public static double printSquare(double radius) {
        double square = Constants.PI * (pow(radius,2));
        return square;
    }

    public static double printLength(double radius) {
        double length = Constants.PI * 2 * radius;
        return length;
    }
}

