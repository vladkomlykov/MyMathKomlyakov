package org.example;

public class RandomInteger {
        public static int fillRange(int fstNum, int lastNum) {
        int currentTime = (int) System.currentTimeMillis();
        int randomNum = fstNum + currentTime % (lastNum - fstNum);
        return randomNum;
    }
}

