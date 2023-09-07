package org.example;

public class Constants {

       public static double PI =  3.1415926535;
        public static double E = 2.7182818284;

        public void printMore(double fstNum, double scdNum) {
            if (fstNum > scdNum) {
                System.out.println("Первое число больше второго: " + fstNum);
            } else
                System.out.println("Второе число больше первого: " + scdNum);
        }
    }
